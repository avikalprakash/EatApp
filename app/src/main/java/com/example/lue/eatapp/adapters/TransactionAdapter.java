package com.example.lue.eatapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.models.Transactionpogo;

import java.util.List;

public class TransactionAdapter extends BaseAdapter {
    Context ctx;
    List<Transactionpogo> data;
    LayoutInflater inflater;
    public TransactionAdapter(Context ctx,List<Transactionpogo> data){
        this.ctx=ctx;
this.data=data;
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
        TextView tid,tname,tstatus,tprice,tdate;
        View v=inflater.inflate(R.layout.transactionsinglerow,null);
        tid=(TextView)v.findViewById(R.id.tvidtransaction);
        tname=(TextView)v.findViewById(R.id.tvnametransaction);
        tprice=(TextView)v.findViewById(R.id.tvpricetransaction);
        tdate=(TextView)v.findViewById(R.id.tvdatetransaction);
        tstatus=(TextView)v.findViewById(R.id.tvstatustransaction);
        tid.setText(data.get(i).getTid());
        tname.setText(data.get(i).getTname());
        tprice.setText(data.get(i).getTprice());
        tdate.setText(data.get(i).getTdate());
        tstatus.setText(data.get(i).getTstatus());
        return v;
    }
}
