package com.simplielend.simplilend.Active_Loan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.simplielend.simplilend.Adapters.Active_loan_adapter;
import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class Active_Loans extends AppCompatActivity {


    //Declaration of Views
    RecyclerView view;
    Active_loan_adapter active_loan_adapter;
    ImageView exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active__loans);

        //Initialisation of recycler view
        view=findViewById(R.id.view1);
        view.setLayoutManager(new LinearLayoutManager(this));
        active_loan_adapter= new Active_loan_adapter(this,getMyList());
        view.setAdapter(active_loan_adapter);
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Active_Loans.this,Dashboard.class));
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

    public void buclick(View view) {

        startActivity(new Intent(Active_Loans.this, Dashboard.class));
    }



}

