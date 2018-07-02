package com.example.android.show_boxstage2.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.show_boxstage2.R;

public class SplashActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

     handler = new Handler();
     handler.postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent intent=new Intent(SplashActivity.this,MainActivity.class);
             startActivity(intent);
             finish();
         }
     }, 3000);
    }
}
