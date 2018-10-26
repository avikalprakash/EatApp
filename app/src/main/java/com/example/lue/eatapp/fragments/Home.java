package com.example.lue.eatapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.activity.NewsAndUpdates;
import com.example.lue.eatapp.activity.Notifications;
import com.example.lue.eatapp.activity.PaymentQr;
import com.example.lue.eatapp.activity.Profile;
import com.example.lue.eatapp.activity.ReferalQr;
import com.example.lue.eatapp.activity.ReferralDetails;
import com.example.lue.eatapp.activity.Search;
import com.example.lue.eatapp.activity.Transactions;


public class Home extends Fragment {

ImageView ivsearch,ivreferalqr,ivreferalinfo,ivprofile,ivpaymentqr,ivtransaction,ivnewsupdate,ivnotification;
TextView tvheader;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivsearch=(ImageView)view.findViewById(R.id.ivsearchhome);
ivreferalqr=(ImageView)view.findViewById(R.id.ivreferalqrhome);
ivreferalinfo=(ImageView)view.findViewById(R.id.ivreferalinfohome);
ivprofile=(ImageView)view.findViewById(R.id.ivprofilehome);
ivpaymentqr=(ImageView)view.findViewById(R.id.ivpaymentqrhome);
ivtransaction=(ImageView)view.findViewById(R.id.ivtransactionhome);
ivnewsupdate=(ImageView)view.findViewById(R.id.ivnewsupdatehome);
ivnotification=(ImageView)view.findViewById(R.id.ivnotificationshome);
ivnotification.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getActivity(), Notifications.class);
        startActivity(i);
    }
});
ivnewsupdate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getActivity(), NewsAndUpdates.class);
        startActivity(i);
    }
});
ivtransaction.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getActivity(), Transactions.class);
        startActivity(i);
    }
});
ivpaymentqr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getActivity(), PaymentQr.class);
        startActivity(i);
    }
});
ivprofile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent i=new Intent(getActivity(), Profile.class);
startActivity(i);
    }
});
ivreferalqr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getActivity(), ReferalQr.class);
        startActivity(i);
    }
});
        ivsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent (getActivity(), Search.class);
                startActivity(i);
            }
        });
        ivreferalinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),ReferralDetails.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



}
