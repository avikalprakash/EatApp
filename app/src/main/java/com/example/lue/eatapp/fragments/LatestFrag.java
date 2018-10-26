package com.example.lue.eatapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.LatestFragListviewAdapter;
import com.example.lue.eatapp.models.LatestFragListviewPogo;

import java.util.ArrayList;
import java.util.List;


public class LatestFrag extends Fragment {
ListView listview;
LatestFragListviewAdapter adapter;
List<LatestFragListviewPogo> data;
    public LatestFrag() {
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
        return inflater.inflate(R.layout.fragment_latest, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listview=(ListView)view.findViewById(R.id.lvlatestfrag);
        data=new ArrayList<>();
        for(int i=0;i<5;i++){
            LatestFragListviewPogo pogo=new LatestFragListviewPogo();
            pogo.setAdress("Flaming Grill Station");
            pogo.setDatestatus("New");
            pogo.setName("Terrific Teriki");
            data.add(pogo);
        }
adapter=new LatestFragListviewAdapter(getActivity(),data);
listview.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
