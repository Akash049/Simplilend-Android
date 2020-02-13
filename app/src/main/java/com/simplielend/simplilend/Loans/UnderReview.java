package com.simplielend.simplilend.Loans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.simplielend.simplilend.Adapters.rejected_loan_adapter;
import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.Models.rejectedloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class UnderReview extends AppCompatActivity {
    Button back;
    RecyclerView view5;
    ImageView exit;
    rejected_loan_adapter rejected_loan_adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_review);

        view5=findViewById(R.id.view5);
        back=findViewById(R.id.goback);
        exit=findViewById(R.id.uexit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnderReview.this, Dashboard.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnderReview.this, Dashboard.class));
            }
        });

        view5.setLayoutManager(new LinearLayoutManager(this));
        rejected_loan_adapter= new rejected_loan_adapter(this,getMyList());
        view5.setAdapter(rejected_loan_adapter);
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
        a.setLoan_type("Personal");
        rejectedloans.add(a);

        a= new rejectedloan();
        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by  Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        a.setLoan_type("Personal");
        rejectedloans.add(a);

        a= new rejectedloan();
        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        a.setLoan_type("C.Product");
        rejectedloans.add(a);

        a= new rejectedloan();
        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        a.setLoan_type("Personal");
        rejectedloans.add(a);

        a= new rejectedloan();
        a.setRej_name("Ajay Singh");
        a.setRej_email("ajay_singh@hotmail.com");
        a.setRej_number("8800518048");
        a.setRej_purpose("Medical");
        a.setComment("Rejected by Credit Bureau");
        a.setRequested_amount("Rs 1000000");
        a.setRequested_tenure("5 Year(s)");
        a.setImg(R.drawable.ic_person_blue_24dp);
        a.setLoan_type("C.Product");
        rejectedloans.add(a);


        return rejectedloans;
    }
}
