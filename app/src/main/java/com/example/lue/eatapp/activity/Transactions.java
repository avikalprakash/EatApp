package com.example.lue.eatapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lue.eatapp.R;
import com.example.lue.eatapp.models.Transactionpogo;
import com.example.lue.eatapp.adapters.TransactionAdapter;

import java.util.ArrayList;
import java.util.List;

public class Transactions extends AppCompatActivity {
ListView lvtransactions;
List<Transactionpogo> list;
TextView tvhedertitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        lvtransactions=(ListView)findViewById(R.id.lvtransaction);
        tvhedertitle=(TextView)findViewById(R.id.tvheadertitle);
        tvhedertitle.setText("Transactions");
        list=new ArrayList<>();
        for (int i=0;i<5;i++){
            Transactionpogo pogo=new Transactionpogo();
            pogo.setTdate("25-06-2018");
            pogo.setTname("Manhaten Fish Market");
            pogo.setTid("#123456");
            pogo.setTstatus("Successful");
            pogo.setTprice("RM25.90");
            list.add(pogo);
        }

        TransactionAdapter adapter=new TransactionAdapter(Transactions.this,list);
        lvtransactions.setAdapter(adapter);
    }
}
