package com.example.lue.eatapp.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.PagerNotification;

public class Notifications extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    TabLayout tablayout;
    FrameLayout container;
    TextView tvheadertitle;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        viewpager=(ViewPager)findViewById(R.id.pagernotification);
        tablayout=(TabLayout)findViewById(R.id.tablayoutnotification);
        tvheadertitle=(TextView)findViewById(R.id.tvheadertitle);
        tvheadertitle.setText("Notifications");
        TabLayout.Tab firsttab=tablayout.newTab();
        tablayout.addTab(firsttab,0,true);
        tablayout.addTab(tablayout.newTab(),1);
        tablayout.addTab(tablayout.newTab(),2);

//        tablayout.addTab(tablayout.newTab(),3);
        tablayout.setOnTabSelectedListener(this);
        PagerNotification adapter=new PagerNotification(getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
    }

    /**
     * Called when a tab enters the selected state.
     *
     * @param tab The tab that was selected
     */
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewpager.setCurrentItem(tab.getPosition());
    }

    /**
     * Called when a tab exits the selected state.
     *
     * @param tab The tab that was unselected
     */
    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    /**
     * Called when a tab that is already selected is chosen again by the user. Some applications
     * may use this action to return to the top level of a category.
     *
     * @param tab The tab that was reselected.
     */
    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
