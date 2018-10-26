package com.example.lue.eatapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lue.eatapp.fragments.CommingSoonFrag;
import com.example.lue.eatapp.fragments.HighlightsFrag;
import com.example.lue.eatapp.fragments.NotifyFrag;

public class PagerNotification extends FragmentStatePagerAdapter {

    int count;
    public PagerNotification(FragmentManager fm, int count) {
        super(fm);
        this.count=count;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                NotifyFrag tab1=new NotifyFrag();
                return tab1;
            case 1:
                CommingSoonFrag tab2=new CommingSoonFrag();
                return tab2;

            case 2:
                HighlightsFrag tab3=new HighlightsFrag();
                return tab3;
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
                return "Notification";

            case 1:
                return "Comming Soon";


            case 2:
                return "Highlights";
        }
        return super.getPageTitle(position);
    }
}
