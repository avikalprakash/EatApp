package com.example.lue.eatapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.lue.eatapp.R;

public class Signup extends AppCompatActivity {
Spinner spgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        spgender=(Spinner)findViewById(R.id.spgendersignup);
        String [] genderdata={"Male","Female"};
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,genderdata);
        spgender.setAdapter(adapter);
    }
}
