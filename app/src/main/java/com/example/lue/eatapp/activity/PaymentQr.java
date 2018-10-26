package com.example.lue.eatapp.activity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lue.eatapp.R;

public class PaymentQr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_qr);
        final Dialog dialog=new Dialog(PaymentQr.this);
        dialog.setContentView(R.layout.paymentstatusdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        TextView dtvok=dialog.findViewById(R.id.tvok);
        TextView dtvstatus=dialog.findViewById(R.id.tvpaymentstatus);

        dtvstatus.setTextColor(Color.parseColor("#58DB77"));
        dtvok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
