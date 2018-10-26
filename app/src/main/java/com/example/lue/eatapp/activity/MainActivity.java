package com.example.lue.eatapp.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.fragments.CalendarFrag;
import com.example.lue.eatapp.fragments.Feedbackfrag;
import com.example.lue.eatapp.fragments.Home;
import com.example.lue.eatapp.fragments.SettingsFrag;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=(BottomNavigationView)findViewById(R.id.bnhomemain);

        Home fhome=new Home();
     android.support.v4.app.FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
        trans.replace(R.id.containermain,fhome);
        trans.commit();
        bn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch(item.getItemId()){
                    case R.id.navinstruction :
Home fhome=new Home();
                        android.support.v4.app.FragmentTransaction trans1=getSupportFragmentManager().beginTransaction();

trans1.replace(R.id.containermain,fhome);
trans1.commit();
                        break;
                    case R.id.navcalendar :
                        CalendarFrag fcalendar=new CalendarFrag();
                        android.support.v4.app.FragmentTransaction trans2=getSupportFragmentManager().beginTransaction();

                        trans2.replace(R.id.containermain,fcalendar);
                        trans2.commit();
                        break;
                    case R.id.navsetting:
                        SettingsFrag fsetting=new SettingsFrag();
                        android.support.v4.app.FragmentTransaction trans3=getSupportFragmentManager().beginTransaction();

                        trans3.replace(R.id.containermain,fsetting);
                        trans3.commit();
                        break;
                    case R.id.navfeed :
                        Feedbackfrag ffeed=new Feedbackfrag();
                        android.support.v4.app.FragmentTransaction trans4=getSupportFragmentManager().beginTransaction();

                        trans4.replace(R.id.containermain,ffeed);
                        trans4.commit();
                        break;

                }
                return true;
            }
        });

    }
}
