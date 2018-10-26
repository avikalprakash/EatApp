package com.ritesh.trn.mha.UtilityPack;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ritesh.trn.mha.LatestUpdatesDetail;
import com.ritesh.trn.mha.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by lue on 27-11-2017.
 */

public class MenAdap extends BaseAdapter {
    private Context activity;
    private LayoutInflater inflater;
    private List<PromotionModel> movieItems;

    String id ;


    public MenAdap(Context context, List<PromotionModel> movie) {

        this.activity = context;
        this.movieItems = movie;

    }


    @Override
    public int getCount() {
        return movieItems.size();
    }

    @Override
    public Object getItem(int location) {
        return movieItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    static class ViewHolder {

        ImageView mgridimage;
        TextView detailtxt;
        TextView date;
        RelativeLayout mrelclick;
        TextView calrtxt;

    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            convertView = inflater.inflate(R.layout.menusubitemlayout, null);
            holder = new ViewHolder();

            holder.mgridimage = (ImageView) convertView
                    .findViewById(R.id.grid_image);

            holder.detailtxt = (TextView) convertView.findViewById(R.id.griddetail_text);
            holder.date = (TextView) convertView.findViewById(R.id.datetxt);
            holder.mrelclick = (RelativeLayout) convertView.findViewById(R.id.relclick);
            convertView.setTag(holder);
        }
        else {

            holder = (ViewHolder) convertView.getTag();
        }


        PromotionModel m = movieItems.get(position);
        Log.d("kbbobo",""+movieItems.size());
        if(!URLUtil.isValidUrl(movieItems.get(position).getImage()))
        {
            holder.mgridimage.setVisibility(View.GONE);
        }
        else
        {
            holder.mgridimage.setVisibility(View.VISIBLE);//add this
            Picasso.with(activity).load(movieItems.get(position).getImage()).placeholder(R.drawable.download).error(R.drawable.newsdummy).into(holder.mgridimage);
            String str = "rjbhai";

        }
        id = m.getItemid();
        Log.d("rj123",id);
        holder.detailtxt.setText(m.getHeading());
        holder.date.setText(m.getPublishtime());

        holder.mrelclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String img = movieItems.get(position).getImage();
                String name= movieItems.get(position).getDetailtxt();
                String itmid= movieItems.get(position).getItemid();
                Intent i = new Intent(activity, LatestUpdatesDetail.class);
                i.putExtra("id",movieItems.get(position).getItemid());
                i.putExtra("img",movieItems.get(position).getImage());
                i.putExtra("nme",movieItems.get(position).getHeading());
                i.putExtra("desc",movieItems.get(position).getDetailtxt());
                activity.startActivity(i);

            }
        });



        return convertView;
    }


}
