package com.simplielend.simplilend.JLG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.simplielend.simplilend.Adapters.jlg_loan_adapter;
import com.simplielend.simplilend.Models.shgloans;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class ViewEditJLG extends AppCompatActivity {
    RecyclerView recyclerView;
    jlg_loan_adapter jlg_loan_adapter;
    Button back;
    ImageView exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_edit_jlg);
        recyclerView=findViewById(R.id.viewjlg);
        back=findViewById(R.id.back);
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEditJLG.this,JLGloanOptions.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEditJLG.this,JLGloanOptions.class));
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        jlg_loan_adapter= new jlg_loan_adapter(this,getMyList());
        recyclerView.setAdapter(jlg_loan_adapter);

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
