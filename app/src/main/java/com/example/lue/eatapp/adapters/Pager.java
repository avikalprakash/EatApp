package com.example.lue.eatapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.lue.eatapp.fragments.LatestFrag;
import com.example.lue.eatapp.fragments.RecentFrag;

/**
 * Created by lue on 21/2/18.
 */

public class Pager extends FragmentStatePagerAdapter {
    int count;
    public Pager(FragmentManager fm, int count) {
        super(fm);
        this.count=count;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                LatestFrag tab1=new LatestFrag();
                return tab1;
            case 1:
                RecentFrag tab2=new RecentFrag();
                return tab2;

//            case 3:
//                Cancled tab4=new Cancled();
//                return tab4;
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
//
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Latest";

            case 1:
                return "Recent";


//            case 3:
//                return "Cancelled";
        }
        return super.getPageTitle(position);
    }
}
