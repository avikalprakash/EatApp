package com.example.lue.eatapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.lue.eatapp.R;

public class Action extends AppCompatActivity {
TextView tvlogin,tvsignup;
Button btflogin;
Spinner splanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        tvlogin=(TextView)findViewById(R.id.tvloginaction);
        tvsignup=(TextView)findViewById(R.id.tvsignupaction);
        btflogin=(Button)findViewById(R.id.btfloginaction);
        splanguage=(Spinner)findViewById(R.id.splanguageaction);
String [] languagedata={"English","Chinese"};
splanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});


        ArrayAdapter spineradapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,languagedata);
        splanguage.setAdapter(spineradapter);

        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Action.this,Login.class);
                startActivity(i);
            }
        });
        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Action.this,Signup.class);
                startActivity(i);
            }
        });
    }
}
