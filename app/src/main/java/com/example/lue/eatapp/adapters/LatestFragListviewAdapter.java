package com.example.lue.eatapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.models.LatestFragListviewPogo;

import java.util.List;


public class LatestFragListviewAdapter extends BaseAdapter {
    List<LatestFragListviewPogo> data;
    Context ctx;
    LayoutInflater inflater;

    public  LatestFragListviewAdapter(Context ctx,List<LatestFragListviewPogo> data){
this.data=data;
this.ctx=ctx;
inflater=LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=inflater.inflate(R.layout.latestsinglerow,null);
        TextView statusdate=(TextView)v.findViewById(R.id.tv_statusdate_latestsinglerow);
        TextView adress=(TextView)v.findViewById(R.id.tv_adress_latestsinglerow);
        TextView name=(TextView)v.findViewById(R.id.tv_name_latestinglerow);
        statusdate.setText(data.get(i).getDatestatus());
        adress.setText(data.get(i).getAdress());
name.setText(data.get(i).getName());
        return v;
    }
}
