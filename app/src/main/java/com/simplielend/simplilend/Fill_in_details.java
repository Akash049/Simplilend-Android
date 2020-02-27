package com.simplielend.simplilend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.Loans.UnderReview;

public class Fill_in_details extends AppCompatActivity {

    Button rp;
    TextView ebname,desig,ad1,pin,pri,mon,ept,adt,st,dt,coap,rcoap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_details);
         ept=findViewById(R.id.empt);
         adt=findViewById(R.id.adt);
         st=findViewById(R.id.st);
         dt=findViewById(R.id.dt);
         coap=findViewById(R.id.coap);
         rcoap=findViewById(R.id.rcoap);

        desig=findViewById(R.id.desig);
        ad1=findViewById(R.id.ad1);
        pin=findViewById(R.id.pin);
        pri=findViewById(R.id.pri);
        mon=findViewById(R.id.mon);
        rp=(Button)findViewById(R.id.rp);
        ebname=findViewById(R.id.ebname);
        Intent intent=getIntent();
        final String value=intent.getStringExtra("key");
        Intent intent1=getIntent();
        final String value1=intent.getStringExtra("key1");
        Intent intent2=getIntent();
        final String value2=intent.getStringExtra("key2");
        Intent intent3=getIntent();
        final String value3=intent.getStringExtra("key3");
        Intent intent4=getIntent();
        final String value4=intent.getStringExtra("key4");
        Intent intent5=getIntent();
        final String value5=intent.getStringExtra("key5");
        Intent intent6=getIntent();
        final String value6=intent.getStringExtra("key6");
        Intent intent7=getIntent();
        final String value7=intent.getStringExtra("key7");
        Intent intent8=getIntent();
        final String value8=intent.getStringExtra("key8");
        Intent intent9=getIntent();
        final String value9=intent.getStringExtra("key9");
        Intent intent10=getIntent();
        final String value10=intent.getStringExtra("key10");
        Intent intent11=getIntent();
        final String value11=intent.getStringExtra("key11");
        desig.setText(value1);
        ad1.setText(value2);
        pin.setText(value3);
        mon.setText(value4);
        pri.setText(value5);
        ept.setText(value6);
        adt.setText(value7);
        st.setText(value8);
        dt.setText(value9);
        coap.setText(value10);
        rcoap.setText(value11);



        ebname.setText(value);

        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fill_in_details.this, UnderReview.class));
                Toast.makeText(getApplicationContext(),"Application send for review",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
