package com.inforegistru.levelstat.Views;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import com.inforegistru.levelstat.Helpers.Utils;
import com.inforegistru.levelstat.R;
import com.inforegistru.levelstat.Retrofit.Scientist;

public class AboutUsActivity extends BaseActivity {

    private Scientist receivedScientist;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar = findViewById(R.id.aboutUsToolBar);
        setSupportActionBar(toolbar);

        findViewById(R.id.mBackArrow).setOnClickListener(v -> finish());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_page_menu_dgti, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_dgti:
                Utils.sendScientistToActivity(this,receivedScientist,ScientistsActivity_dgti.class);
                finish();
                return true;


            case android.R.id.home:


                Intent intent;
                intent = new Intent(this, DashboardActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finish();
                startActivity(intent);
                return true;


//            case R.id.action_edit_en:
//                Utils.sendScientistToActivity(this,receivedScientist,helpen.class);
//                finish();
//                return true;
//
//            case R.id.action_edit_ru:
//                Utils.sendScientistToActivity(this,receivedScientist,helpru.class);
//                finish();
//                return true;
//
//            case android.R.id.home:
//                //NavUtils.navigateUpFromSameTask(this);
//                Utils.sendScientistToActivity(this,receivedScientist,ScientistsActivity.class);
//                finish();
//                return true;
//
//            case R.id.video3:
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(com.bancusoft.nextlevel.Helpers.Utils.youtube_level_stat ));
//                startActivity(browserIntent);
//                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(this, DashboardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(intent);
    }
}
