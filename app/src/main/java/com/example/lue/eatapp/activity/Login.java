package com.example.lue.eatapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lue.eatapp.R;

public class Login extends AppCompatActivity {
TextView tvsignup,tvlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvsignup=(TextView)findViewById(R.id.tvsignuplogin);
        tvlogin=(TextView)findViewById(R.id.tvloginlogin);
        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (Login.this,MainActivity.class);
                startActivity(i);
            }
        });
        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Login.this,Signup.class);
                startActivity(i);
            }
        });
    }
}
