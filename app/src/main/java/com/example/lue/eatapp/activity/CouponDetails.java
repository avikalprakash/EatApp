package com.example.lue.eatapp.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.MerchantDetailAdapter;
import com.example.lue.eatapp.adapters.PagerMerchantDetails;
import com.example.lue.eatapp.adapters.PagerNotification;

public class MerchantDetails extends AppCompatActivity  implements TabLayout.OnTabSelectedListener{
ViewPager vpmerchantdetails,vplist;
TabLayout tablayout;
ImageView back;
TextView headertitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant_details);
        vpmerchantdetails=(ViewPager)findViewById(R.id.vpmerchantdetail);
        vplist=(ViewPager)findViewById(R.id.pagermerchantdetail);
        tablayout=(TabLayout)findViewById(R.id.tablayoutmerchantdetail);
        headertitle=(TextView)findViewById(R.id.tvheadertitle);
        headertitle.setText("Merchant Details");
        back=(ImageView)findViewById(R.id.ivheaderleft);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MerchantDetails.this,Merchants.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
        int [] data={R.drawable.demofood,
        R.drawable.food};
        MerchantDetailAdapter adapter=new MerchantDetailAdapter(MerchantDetails.this,data);
        vpmerchantdetails.setAdapter(adapter);


        TabLayout.Tab firsttab=tablayout.newTab();
        tablayout.addTab(firsttab,0,true);
        tablayout.addTab(tablayout.newTab(),1);
        tablayout.addTab(tablayout.newTab(),2);

//        tablayout.addTab(tablayout.newTab(),3);
        tablayout.setOnTabSelectedListener(this);
        PagerMerchantDetails adapter2=new PagerMerchantDetails(getSupportFragmentManager(),tablayout.getTabCount());
        vplist.setAdapter(adapter2);
        tablayout.setupWithViewPager(vplist);
    }

    /**
     * Called when a tab enters the selected state.
     *
     * @param tab The tab that was selected
     */
    @Override
    public void onTabSelected(TabLayout.Tab tab) {

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
