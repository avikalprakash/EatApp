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
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.adapters.LatestFragListviewAdapter;
import com.example.lue.eatapp.adapters.NotifyFragListviewAdapter;
import com.example.lue.eatapp.models.LatestFragListviewPogo;
import com.example.lue.eatapp.models.NotifyFragListviewPogo;

import java.util.ArrayList;
import java.util.List;


public class NotifyFrag extends Fragment {
ListView listview;
NotifyFragListviewAdapter adapter;
List<NotifyFragListviewPogo> data;

    public NotifyFrag() {
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
        return inflater.inflate(R.layout.fragment_notify, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listview=(ListView)view.findViewById(R.id.lvnotify);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        data=new ArrayList<>();
        for(int i=0;i<5;i++){
            NotifyFragListviewPogo pogo=new NotifyFragListviewPogo();
            pogo.setAdress("Flaming Grill Station");
            pogo.setDatestatus("New");
            pogo.setName("Terrific Teriki");
            data.add(pogo);
        }
        adapter=new NotifyFragListviewAdapter(getActivity(),data);
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
