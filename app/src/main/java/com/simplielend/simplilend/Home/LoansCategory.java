package com.simplielend.simplilend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.Forms.SelectLoanType;
import com.simplielend.simplilend.R;

public class LoansCategory extends AppCompatActivity implements View.OnClickListener {

    //Var
    LinearLayout msmeLoan, consumerLoan, jlgLoan, shgLoans;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_loan_category);
        initialize();
    }

    public void initialize(){
        msmeLoan = (LinearLayout)findViewById(R.id.msme_loans);
        consumerLoan = (LinearLayout)findViewById(R.id.consumer_loans);
        consumerLoan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.consumer_loans:
                startActivity(new Intent(LoansCategory.this, SelectLoanType.class));
        }
    }
}
