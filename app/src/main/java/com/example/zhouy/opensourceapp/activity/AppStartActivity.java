package com.example.zhouy.opensourceapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zhouy.opensourceapp.R;

/**
 * User: zhy
 * Date: 2016-08-25
 */
public class AppStartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_app_start);
        View view = (View)findViewById(R.id.app_start_layout);
        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoMainActivity();
            }
        },800);
    }


    private void gotoMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
