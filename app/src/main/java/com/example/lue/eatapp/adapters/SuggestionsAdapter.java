package com.example.lue.eatapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lue.eatapp.R;

public class SuggestionsAdapter extends RecyclerView.Adapter <SuggestionsAdapter.MyViewholder>{
Context ctx;
String [] data;
public SuggestionsAdapter(Context ctx,String [] data){
    this.data=data;
    this.ctx=ctx;

}
    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(ctx).inflate(R.layout.gridsinglerow,null);
        MyViewholder viewholder=new MyViewholder(v);
        return viewholder;
    }

    /**
     * Called by RecyclerView to display the data at the specified position. This method should
     * update the contents of the {@link ViewHolder#itemView} to reflect the item at the given
     * position.
     * <p>
     * Note that unlike {@link ListView}, RecyclerView will not call this method
     * again if the position of the item changes in the data set unless the item itself is
     * invalidated or the new position cannot be determined. For this reason, you should only
     * use the <code>position</code> parameter while acquiring the related data item inside
     * this method and should not keep a copy of it. If you need the position of an item later
     * on (e.g. in a click listener), use {@link ViewHolder#getAdapterPosition()} which will
     * have the updated adapter position.
     * <p>
     * Override {@link #onBindViewHolder(ViewHolder, int, List)} instead if Adapter can
     * handle efficient partial bind.
     *
     * @param holder   The ViewHolder which should be updated to represent the contents of the
     *                 item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
holder.tvsuggested.setText(data[position]);
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewholder extends RecyclerView.ViewHolder{
TextView tvsuggested;
        public MyViewholder(View itemView) {
            super(itemView);
            tvsuggested=(TextView)itemView.findViewById(R.id.tvsuggested);
        }
    }
}
