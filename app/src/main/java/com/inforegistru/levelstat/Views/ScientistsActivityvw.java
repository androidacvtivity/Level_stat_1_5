package com.inforegistru.levelstat.Views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.inforegistru.levelstat.Helpers.MyAdaptervw;
import com.inforegistru.levelstat.Helpers.Utils;
import com.inforegistru.levelstat.R;
import com.inforegistru.levelstat.Retrofit.ResponseModelvw;
import com.inforegistru.levelstat.Retrofit.RestApi;
import com.inforegistru.levelstat.Retrofit.Scientist;
import com.inforegistru.levelstat.Retrofit.Scientistvw;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScientistsActivityvw extends AppCompatActivity
        implements SearchView.OnQueryTextListener,MenuItem.OnActionExpandListener{

    //We define our instance fields
    private RecyclerView rv;
    private MyAdaptervw mAdapter;
    private LinearLayoutManager layoutManager;
    public ArrayList<Scientistvw> allPagesScientists = new ArrayList();
    private List<Scientistvw> currentPageScientists;
    private Boolean isScrolling = false;
    private int currentScientists, totalScientists, scrolledOutScientists;
    private ProgressBar mProgressBar;
    private Scientist receivedScientist;
    /**
     * We initialize our widgets
     */
    private void initializeViews() {
        mProgressBar = findViewById(R.id.mProgressBarLoadvw);
        mProgressBar.setIndeterminate(true);
        Utils.showProgressBar(mProgressBar);
        rv = findViewById(R.id.mRecyclerViewvw);
    }

    /**
     * This method will setup oir RecyclerView
     */
    private void setupRecyclerView() {
        layoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdaptervw(this, allPagesScientists);
        rv.setAdapter(mAdapter);
        rv.setLayoutManager(layoutManager);
        rv.setBackgroundColor(Color.TRANSPARENT);
    }
    /**
     * This method will download for us data from php mysql based on supplied query string
     * as well as pagination parameters. We are basiclally searching or selecting data
     * without seaching. However all the arriving data is paginated at the server level.
     */
    private void retrieveAndFillRecyclerView(final String action, String queryString,
                                             final String start, String limit) {

        mAdapter.searchString = queryString;
        RestApi api = Utils.getClient().create(RestApi.class);
        Call<ResponseModelvw> retrievedData;

        if (action.equalsIgnoreCase("GET_PAGINATEDVW")) {
            retrievedData = api.searchvw("GET_PAGINATEDVW", queryString, start, limit);
            Utils.showProgressBar(mProgressBar);
        } else if (action.equalsIgnoreCase("GET_PAGINATED_SEARCHVW")) {
            Utils.showProgressBar(mProgressBar);
            retrievedData = api.searchvw("GET_PAGINATED_SEARCHVW", queryString, start, limit);
        } else {
            Utils.showProgressBar(mProgressBar);
            retrievedData = api.retrievevw();
        }


        retrievedData.enqueue(new Callback<ResponseModelvw>() {
            @Override
            public void onResponse(Call<ResponseModelvw> call, Response<ResponseModelvw>
                    response) {
                Log.d("RETROFIT", "CODE : " + response.body().getCodevw());
                Log.d("RETROFIT", "MESSAGE : " + response.body().getMessagevw());
                Log.d("RETROFIT", "RESPONSE : " + response.body().getResultvw());
                currentPageScientists = response.body().getResultvw();

                if (currentPageScientists != null && currentPageScientists.size() > 0) {
                    if (action.equalsIgnoreCase("GET_PAGINATED_SEARCHVW")) {
                        allPagesScientists.clear();
                    }
                    for (int i = 0; i < currentPageScientists.size(); i++) {
                        allPagesScientists.add(currentPageScientists.get(i));
                    }

                } else {
                    if (action.equalsIgnoreCase("GET_PAGINATED_SEARCHVW")) {
                        allPagesScientists.clear();
                    }
                }
                mAdapter.notifyDataSetChanged();
                Utils.hideProgressBar(mProgressBar);
            }

            @Override
            public void onFailure(Call<ResponseModelvw> call, Throwable t) {
                Utils.hideProgressBar(mProgressBar);
                Log.d("RETROFIT", "ERROR: " + t.getMessage());
                Utils.showInfoDialog(ScientistsActivityvw.this, "ERROR", t.getMessage());
            }
        });
    }
    /**
     * We will listen to scroll events. This is important as we are implementing scroll to
     * load more data pagination technique
     */
    private void listenToRecyclerViewScroll() {
        rv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView rv, int newState) {
                //when scrolling starts
                super.onScrollStateChanged(rv, newState);
                //check for scroll state
                if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                    isScrolling = true;
                }
            }
            @Override
            public void onScrolled(RecyclerView rv, int dx, int dy) {
                // When the scrolling has stopped
                super.onScrolled(rv, dx, dy);
                currentScientists = layoutManager.getChildCount();
                totalScientists = layoutManager.getItemCount();
                scrolledOutScientists = ((LinearLayoutManager) rv.getLayoutManager()).
                        findFirstVisibleItemPosition();

                if (isScrolling && (currentScientists + scrolledOutScientists ==
                        totalScientists)) {
                    isScrolling = false;

                    if (dy > 0) {
                        // Scrolling up
                        retrieveAndFillRecyclerView("GET_PAGINATEDVW",
                                mAdapter.searchString,
                                String.valueOf(totalScientists), "100");

                    } else {
                        // Scrolling down
                    }
                }
            }
        });
    }
    /**
     * We inflate our menu. We show SearchView inside the toolbar
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.scientists_page_menu_vw, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search_vw);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);
        searchView.setIconified(true);
        searchView.setQueryHint("Căutare");
        return true;
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_new_vw:
//                Utils.openActivity(this, help_vw.class);
//                finish();
//                return true;
//
//            case R.id.action_new_en_vw:
//                Utils.openActivity(this, help_vw_en.class);
//                finish();
//                return true;
//
//
//            case R.id.action_new_ru_vw:
//                Utils.openActivity(this, help_vw_ru.class);
//                finish();
//                return true;
//
//            case R.id.video3_vw:
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(com.bancusoft.nextlevel.Helpers.Utils.youtube_level_stat ));
//                startActivity(browserIntent);
//                break;
//
//
//            case R.id.home:
//                Utils.openActivity(this, DashboardActivity.class);
//                finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }







    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_new_vw:
                Utils.sendScientistToActivity(this,receivedScientist,help_vw.class);
                finish();
                return true;


            case R.id.action_new_en_vw:
                Utils.sendScientistToActivity(this,receivedScientist,help_vw_en.class);
                finish();
                return true;

            case R.id.action_new_ru_vw:
                Utils.sendScientistToActivity(this,receivedScientist,help_vw_ru.class);
                finish();
                return true;

            case android.R.id.home:
                //NavUtils.navigateUpFromSameTask(this);
//                Utils.sendScientistToActivity(this,receivedScientist,structurabns.class);
//                finish();
//
                Intent intent;
                intent = new Intent(this, DashboardActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finish();
                startActivity(intent);

                return true;

//            case R.id.back_str:
//                Utils.openActivity(this, structurabns.class);
//                finish();
//                return true;

            case R.id.video2_vw:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(com.inforegistru.levelstat.Helpers.Utils.youtube_level_stat ));
                startActivity(browserIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_new:
//                Utils.openActivity(this, CRUDActivity.class);
//                finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        retrieveAndFillRecyclerView("GET_PAGINATED_SEARCHVW", query, "0", "100");
        return false;
    }

    @Override
    public boolean onMenuItemActionExpand(MenuItem item) {
        return false;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem item) {
        return false;
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        this.finish();
//    }


    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(this, DashboardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientistsvw);

        initializeViews();
        this.listenToRecyclerViewScroll();
        setupRecyclerView();
        retrieveAndFillRecyclerView("GET_PAGINATEDVW", "", "0", "100");
    }
}

//end

