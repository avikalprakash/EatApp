package com.example.lue.eatapp.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.Pager;
import com.example.lue.eatapp.fragments.LatestFrag;
import com.example.lue.eatapp.fragments.RecentFrag;

public class NewsAndUpdates extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
TabLayout tablayout;
TextView tvheadertitle;
ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_and_updates);
        viewpager=(ViewPager)findViewById(R.id.pager);
        tablayout=(TabLayout)findViewById(R.id.tablayout);
        tvheadertitle=(TextView)findViewById(R.id.tvheadertitle);
tvheadertitle.setText("News & update");
        TabLayout.Tab firsttab=tablayout.newTab();
        tablayout.addTab(firsttab,0,true);
        tablayout.addTab(tablayout.newTab(),1);

//        tablayout.addTab(tablayout.newTab(),3);
        tablayout.setOnTabSelectedListener(this);
        Pager adapter=new Pager(getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
//        android.support.v4.app.Fragment fragment=new LatestFrag();
//        android.support.v4.app.FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
//        trans.replace(R.id.containernews,fragment);
//        trans.commit();

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
