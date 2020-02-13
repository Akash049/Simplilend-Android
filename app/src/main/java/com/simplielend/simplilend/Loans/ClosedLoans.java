package com.simplielend.simplilend.Loans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.simplielend.simplilend.Adapters.Active_loan_adapter;
import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class ClosedLoans extends AppCompatActivity {

    RecyclerView view;
    Active_loan_adapter active_loan_adapter;
    Button back;
    ImageView exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closed_loans);

        view=findViewById(R.id.view3);
        view.setLayoutManager(new LinearLayoutManager(this));
        active_loan_adapter= new Active_loan_adapter(this,getMyList());
        view.setAdapter(active_loan_adapter);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClosedLoans.this,Dashboard.class));
            }
        });
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClosedLoans.this, Dashboard.class));
            }
        });

    }
    private ArrayList<Activeloan> getMyList()
    {
        ArrayList<Activeloan> activeloans=new ArrayList<>();
        Activeloan a= new Activeloan();
        a.setName("Ajay Singh");
        a.setStatus_email("Unverified");
        a.setStatus_mobile("Unverified");
        a.setPurpose("Medical");
        a.setApproved_amount("100000 INR");
        a.setImg(R.drawable.ic_person_blue_24dp);
        activeloans.add(a);

        a= new Activeloan();
        a.setName("Ajay Singh");
        a.setStatus_email("Unverified");
        a.setStatus_mobile("Unverified");
        a.setPurpose("Medical");
        a.setApproved_amount("100000 INR");
        a.setImg(R.drawable.ic_person_blue_24dp);
        activeloans.add(a);

        a= new Activeloan();
        a.setName("Ajay Singh");
        a.setStatus_email("Unverified");
        a.setStatus_mobile("Unverified");
        a.setPurpose("Medical");
        a.setApproved_amount("100000 INR");
        a.setImg(R.drawable.ic_person_blue_24dp);
        activeloans.add(a);


        return activeloans;
    }
}
