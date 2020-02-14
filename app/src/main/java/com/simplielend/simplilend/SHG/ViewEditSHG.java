package com.simplielend.simplilend.SHG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.simplielend.simplilend.Adapters.Active_loan_adapter;
import com.simplielend.simplilend.Adapters.shg_loans_adapter;
import com.simplielend.simplilend.JLG.JLGloanOptions;
import com.simplielend.simplilend.JLG.ViewEditJLG;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.Models.shgloans;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class ViewEditSHG extends AppCompatActivity {
    RecyclerView recyclerView;
    shg_loans_adapter shg_loans_adapter;
    Button back;
    ImageView exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_edit_shg);
        recyclerView=findViewById(R.id.viewshg);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        shg_loans_adapter= new shg_loans_adapter(this,getMyList());
        recyclerView.setAdapter(shg_loans_adapter);
        back=findViewById(R.id.back);
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEditSHG.this, SHGLoanOptions.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEditSHG.this,SHGLoanOptions.class));
            }
        });

    }
    private ArrayList<shgloans> getMyList() {
        ArrayList<shgloans> shgloans = new ArrayList<>();
        shgloans a = new shgloans();
    //    a.setDates(2019 - 05 - 05);
        a.setTenures("5 Year(s)");
        a.setPurposes("Medical");
        a.setAmounts("100000 INR");
        a.setInterests("26 % per annum");
        a.setP1("Danyl Fernandes");
        a.setP2("Sachin Yadav");
        a.setP3("Prakash Yadav");
        a.setP4("Manish Kumar");
        shgloans.add(a);


        a = new shgloans();
      //  a.setDates(2019 - 05 - 05);
        a.setTenures("5 Year(s)");
        a.setPurposes("Medical");
        a.setAmounts("100000 INR");
        a.setInterests("26 % per annum");
        a.setP1("Danyl Fernandes");
        a.setP2("Sachin Yadav");
        a.setP3("Prakash Yadav");
        a.setP4("Manish Kumar");
        shgloans.add(a);

        a = new shgloans();
    //    a.setDates(2019 - 05 - 05);
        a.setTenures("5 Year(s)");
        a.setPurposes("Medical");
        a.setAmounts("100000 INR");
        a.setInterests("26 % per annum");
        a.setP1("Danyl Fernandes");
        a.setP2("Sachin Yadav");
        a.setP3("Prakash Yadav");
        a.setP4("Manish Kumar");
        shgloans.add(a);

        return shgloans;

    }

}
