package com.example.lue.eatapp.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lue.eatapp.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent i=new Intent(Splash.this,Action.class);
             startActivity(i);
         }
     },3000);
    }
}
