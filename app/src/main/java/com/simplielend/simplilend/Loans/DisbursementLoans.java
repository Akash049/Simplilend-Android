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
import com.simplielend.simplilend.Adapters.rejected_loan_adapter;
import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class DisbursementLoans extends AppCompatActivity {

    RecyclerView view4;
    Active_loan_adapter active_loan_adapter;
    ImageView exit;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disbursement_loans);
        view4=findViewById(R.id.view4);
        view4.setLayoutManager(new LinearLayoutManager(this));
        active_loan_adapter= new Active_loan_adapter(this,getMyList());
        view4.setAdapter(active_loan_adapter);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisbursementLoans.this, Dashboard.class));
            }
        });
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisbursementLoans.this, Dashboard.class));
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

        a.setName("Ajay Singh");
        a.setStatus_email("Unverified");
        a.setStatus_mobile("Unverified");
        a.setPurpose("Medical");
        a.setApproved_amount("100000 INR");
        a.setImg(R.drawable.ic_person_blue_24dp);
        activeloans.add(a);

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
