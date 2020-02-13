package com.simplielend.simplilend.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.Loans.Active_Loans;
import com.simplielend.simplilend.Loans.ClosedLoans;
import com.simplielend.simplilend.Loans.DisbursementLoans;
import com.simplielend.simplilend.Loans.Rejected_Loans;
import com.simplielend.simplilend.R;
import com.simplielend.simplilend.Loans.UnderReview;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    //var
    LinearLayout newLoanBtn;
    LinearLayout activeloan;
    LinearLayout rejectedloan;
    LinearLayout closedloans;
    LinearLayout disburs;
    LinearLayout underev;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initialize();
    }

    public void initialize(){
        newLoanBtn = (LinearLayout) findViewById(R.id.new_loan_application);
        activeloan=(LinearLayout) findViewById(R.id.active_loans);
        rejectedloan=(LinearLayout)findViewById(R.id.relo);
        closedloans=(LinearLayout)findViewById(R.id.closed_loans);
        disburs=(LinearLayout)findViewById(R.id.disburs);
        underev=(LinearLayout)findViewById(R.id.under_review);
        disburs.setOnClickListener(this);
        closedloans.setOnClickListener(this);
        rejectedloan.setOnClickListener(this);
        activeloan.setOnClickListener(this);
        newLoanBtn.setOnClickListener(this);
        underev.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.new_loan_application:
                startActivity(new Intent(Dashboard.this, LoansCategory.class));
                break;

            case R.id.active_loans:
                startActivity(new Intent(Dashboard.this, Active_Loans.class));
                Toast.makeText(getApplicationContext(),"Active Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.relo:
                startActivity(new Intent(Dashboard.this, Rejected_Loans.class));
                Toast.makeText(getApplicationContext(),"Rejected Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.closed_loans:
                startActivity(new Intent(Dashboard.this, ClosedLoans.class));
                Toast.makeText(getApplicationContext(),"Closed Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.disburs:
                startActivity(new Intent(Dashboard.this, DisbursementLoans.class));
                Toast.makeText(getApplicationContext(),"Disbursement Loans",Toast.LENGTH_LONG).show();
                break;

            case R.id.under_review:
                startActivity(new Intent(Dashboard.this, UnderReview.class));
                Toast.makeText(getApplicationContext(),"Under Review Applications",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
