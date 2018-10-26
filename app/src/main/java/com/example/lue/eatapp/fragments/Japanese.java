package com.example.lue.eatapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.PagerCategory;
import com.example.lue.eatapp.adapters.PagerSubCategory;


public class Category1 extends Fragment implements TabLayout.OnTabSelectedListener {
    ViewPager viewpager;
    TabLayout tablayout;


    public Category1() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        tablayout=(TabLayout)view.findViewById(R.id.tablayoutsubcategory1);
        viewpager=(ViewPager)view.findViewById(R.id.pagersubcategory1);

        TabLayout.Tab firsttab=tablayout.newTab();
        tablayout.addTab(firsttab,0,true);
        tablayout.addTab(tablayout.newTab(),1);
        tablayout.addTab(tablayout.newTab(),2);
        tablayout.addTab(tablayout.newTab(),3);
        tablayout.addTab(tablayout.newTab(),4);



        tablayout.setOnTabSelectedListener(this);
        PagerSubCategory adapter=new PagerSubCategory(getActivity().getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
        for (int i = 0; i < tablayout.getTabCount(); i++) {
            switch (i){
                case 0 :
                tablayout.getTabAt(0).setIcon(R.drawable.rice);
                break;
                case 1 :
                    tablayout.getTabAt(1).setIcon(R.drawable.sushi);
                    break;
                case 2 :
                    tablayout.getTabAt(2).setIcon(R.drawable.noodle);
                    break;
                case 3 :
                    tablayout.getTabAt(3).setIcon(R.drawable.dumli);
                    break;
                case 4 :
                    tablayout.getTabAt(4).setIcon(R.drawable.rice);
                    break;



            }
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
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
