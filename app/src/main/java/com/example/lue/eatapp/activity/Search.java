package com.example.lue.eatapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.SuggestionsAdapter;

public class Search extends AppCompatActivity {
RecyclerView rvsggestion;
EditText etsearch;
TextView tvheader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        rvsggestion=(RecyclerView)findViewById(R.id.rvsuggestionssearch);
        etsearch=(EditText)findViewById(R.id.etsearch);
        tvheader=(TextView)findViewById(R.id.tvheadertitle);
        tvheader.setText("Search");
        StaggeredGridLayoutManager lmanager=new StaggeredGridLayoutManager(3,1);

        String sdata []= {"Steamed","Streak","Strukel","stew","salamon","soyasauce"};
        SuggestionsAdapter adapter=new SuggestionsAdapter(Search.this,sdata);
        rvsggestion.setLayoutManager(lmanager);
        rvsggestion.setAdapter(adapter);
    }
}
