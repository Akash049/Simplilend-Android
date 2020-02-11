package com.simplielend.simplilend.Loans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.simplielend.simplilend.Adapters.Active_loan_adapter;
import com.simplielend.simplilend.Adapters.rejected_loan_adapter;
import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.Models.rejectedloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class Rejected_Loans extends AppCompatActivity {

    RecyclerView view2;
    rejected_loan_adapter rejected_loan_adapter;
    ImageView exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejectedloans);
        view2=findViewById(R.id.view2);
        view2.setLayoutManager(new LinearLayoutManager(this));
        rejected_loan_adapter= new rejected_loan_adapter(this,getMyList());
        view2.setAdapter(rejected_loan_adapter);
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rejected_Loans.this,Dashboard.class));
            }
        });


    }

    private ArrayList<rejectedloan> getMyList()
    {
        ArrayList<rejectedloan> rejectedloans=new ArrayList<>();
        rejectedloan a= new rejectedloan();
        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        rejectedloans.add(a);

        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        rejectedloans.add(a);

        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        rejectedloans.add(a);

        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        rejectedloans.add(a);

        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        rejectedloans.add(a);


        return rejectedloans;
    }

    public void buclick(View view) {
        startActivity(new Intent(Rejected_Loans.this, Dashboard.class));
    }
}
