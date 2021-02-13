package com.inforegistru.levelstat.Views;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.inforegistru.levelstat.Retrofit.Scientist;
import androidx.appcompat.widget.Toolbar;

import com.inforegistru.levelstat.Helpers.Utils;
import com.inforegistru.levelstat.R;

public class helpen extends BaseActivity {

    private Scientist receivedScientist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_en);

        Toolbar toolbar = findViewById(R.id.aboutUsToolBarn_en);
        setSupportActionBar(toolbar);

//        findViewById(R.id.mBackArrowh_en).setOnClickListener(v -> finish());

        findViewById(R.id.mBackArrowh_en).setOnClickListener( v -> Utils.showInfoDialog_help_en(this,
                "Attention!", "Are you sure you want to exit? We have translate help in romanian and russian.") );
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
//        this.finish();

        Utils.showInfoDialog_help_en(this,
                "Attention!", "Are you sure you want to exit? We have translate help in romanian and russian.");
    }


    /**
     * Let's inflate our menu for the detail page
     */

    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.help, menu);

        getMenuInflater().inflate(R.menu.help, menu);
        return true;

    }

    /**
     * When a menu item is selected we want to navigate to the appropriate page
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rolang:
                Utils.sendScientistToActivity(this, receivedScientist, help.class);
                finish();
                return true;

            case R.id.enlang:
                Utils.sendScientistToActivity(this, receivedScientist, helpen.class);
                finish();
                return true;

            case R.id.rulang:
                Utils.sendScientistToActivity(this,receivedScientist,helpru.class);
                finish();
                return true;

            case R.id.link1:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(com.inforegistru.levelstat.Helpers.Utils.youtube_level_stat ));
                startActivity(browserIntent);
                break;

//            case android.R.id.home:
//
//                Utils.sendScientistToActivity(this,receivedScientist,ScientistsActivity.class);
//                finish();
//                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}