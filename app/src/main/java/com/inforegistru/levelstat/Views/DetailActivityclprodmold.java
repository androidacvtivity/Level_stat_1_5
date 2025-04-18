package com.inforegistru.levelstat.Views;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.inforegistru.levelstat.Retrofit.Cl_prodmold;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.inforegistru.levelstat.Helpers.Utils;
import com.inforegistru.levelstat.R;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;


public class DetailActivityclprodmold extends AppCompatActivity{

    private TextView CODUL_TV_CL_PRODMOLD ,DENUMIRE_TV_CL_PRODMOLD, UM_TV_CL_PRODMOLD;

    private Cl_prodmold receivedCl_prodmold;

    private CollapsingToolbarLayout mCollapsingToolbarLayout;


    /**
     * Let's initialize our widgets
     */
    private void initializeWidgets(){
        CODUL_TV_CL_PRODMOLD = findViewById(R.id.CODUL_TV_CL_PRODMOLD);
        DENUMIRE_TV_CL_PRODMOLD = findViewById(R.id.DENUMIRE_TV_CL_PRODMOLD);
        UM_TV_CL_PRODMOLD   = findViewById(R.id.UM_TV_CL_PRODMOLD);


        mCollapsingToolbarLayout=findViewById(R.id.mCollapsingToolbarLayoutprodmold);
    }



    /**
     * We will now receive and show our data to their appropriate views.
     */
    private void receiveAndShowData(){

        receivedCl_prodmold  = Utils.receiveCl_prodmold(getIntent(),DetailActivityclprodmold.this);

        if(receivedCl_prodmold != null){
            CODUL_TV_CL_PRODMOLD.setText(receivedCl_prodmold.getCODUL());
            DENUMIRE_TV_CL_PRODMOLD.setText(receivedCl_prodmold.getDENUMIRE());
            UM_TV_CL_PRODMOLD.setText(receivedCl_prodmold.getUM());



            mCollapsingToolbarLayout.setTitle(receivedCl_prodmold.getCODUL());

            mCollapsingToolbarLayout.setExpandedTitleColor(getResources().
                    getColor(R.color.white));
        }

    }

    /**
     * Let's inflate our menu for the detail page
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_page_menu_prodmold_cl, menu);
        return true;
    }


    /**
     * When a menu item is selected we want to navigate to the appropriate page
     */


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit_cl_prodmold:
                Utils.sendCl_prodmoldToActivity(this,receivedCl_prodmold,help_vw.class);
                finish();
                return true;


            case R.id.action_edit_en_cl_prodmold:
                Utils.sendCl_prodmoldToActivity(this,receivedCl_prodmold,help_vw_en.class);
                finish();
                return true;

            case R.id.action_edit_ru_cl_prodmold:
                Utils.sendCl_prodmoldToActivity(this,receivedCl_prodmold,help_vw_ru.class);
                finish();
                return true;

            case android.R.id.home:
                //NavUtils.navigateUpFromSameTask(this);
                Utils.sendCl_prodmoldToActivity(this,receivedCl_prodmold,ScientistsActivityclprodmold.class);
                finish();
                return true;

            case R.id.video3_cl_prodmold:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(com.inforegistru.levelstat.Helpers.Utils.youtube_level_stat ));
                startActivity(browserIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }



    /**
     * Let's once again override the attachBaseContext. We do this for our
     * Calligraphy library
     */

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    /**
     * Let's finish the current activity when back button is pressed
     */

    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(this, ScientistsActivityclprodmold.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cl_prodmold);

        CODUL_TV_CL_PRODMOLD = findViewById(R.id.CODUL_TV_CL_PRODMOLD);
        DENUMIRE_TV_CL_PRODMOLD = findViewById(R.id.DENUMIRE_TV_CL_TARII);
        UM_TV_CL_PRODMOLD   = findViewById(R.id.UM_TV_CL_PRODMOLD);

        Button mBtnShare = findViewById(R.id.btnShare_cl_prodmold);

        mBtnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s_CODUL_TV_CL_PRODMOLD = CODUL_TV_CL_PRODMOLD.getText().toString();
                String s_DENUMIRE_TV_CL_PRODMOLD = DENUMIRE_TV_CL_PRODMOLD.getText().toString();
                String s_UM_TV_CL_PRODMOLD = UM_TV_CL_PRODMOLD.getText().toString();




                String a = " Codul Prodmold : " + s_CODUL_TV_CL_PRODMOLD + " - Denumirea , \n" +
                        "  :  " + s_DENUMIRE_TV_CL_PRODMOLD + " Unitatea de măsură : " + s_UM_TV_CL_PRODMOLD;


                String contentShare = new String(a);

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Clasificatorul - Produse si servicii cu caracter industrial");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, contentShare);

                startActivity(Intent.createChooser(sharingIntent, "Share text via"));
            }
        });



        initializeWidgets();
        receiveAndShowData();
    }
}
