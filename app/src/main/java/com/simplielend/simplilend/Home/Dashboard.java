package com.simplielend.simplilend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.R;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    //var
    LinearLayout newLoanBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initialize();
    }

    public void initialize(){
        newLoanBtn = (LinearLayout) findViewById(R.id.new_loan_application);
        newLoanBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.new_loan_application:
                startActivity(new Intent(Dashboard.this, LoansCategory.class));
        }
    }
}
