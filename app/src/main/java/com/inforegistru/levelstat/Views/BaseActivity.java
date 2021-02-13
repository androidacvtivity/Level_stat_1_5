package com.inforegistru.levelstat.Views;
import androidx.appcompat.app.AppCompatActivity;

import com.inforegistru.levelstat.Helpers.Utils;



public class BaseActivity  extends AppCompatActivity {
    protected void show(String message){
        Utils.show(this,message);
    }
    protected void openPage(Class clazz){
        Utils.openActivity(this,clazz);
    }
}

