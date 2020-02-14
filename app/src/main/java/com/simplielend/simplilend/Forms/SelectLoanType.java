package com.simplielend.simplilend.Forms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.Home.LoansCategory;
import com.simplielend.simplilend.R;

public class    SelectLoanType extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    //var
    Spinner loanType;
    ArrayAdapter loanAdapter;
    EditText loanId;
    TextView previous, next;

    //Constants
    private String[] loanTypeValue = { "Property Loan", "Education Loan", "Automobile Loan", "Other Personal Loan"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_loan_type);
        initialize();
    }

    public void initialize(){
        loanId = (EditText)findViewById(R.id.loan_id);
        loanId.setText( String.valueOf(uniqueLoanId()));
        loanType = (Spinner) findViewById(R.id.loan_type);
        loanType.setOnItemSelectedListener(this);
        loanAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,loanTypeValue);
        loanAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loanType.setAdapter(loanAdapter);
        previous = (TextView)findViewById(R.id.previous);
        previous.setOnClickListener(this);
        next = (TextView)findViewById(R.id.next);
        next.setOnClickListener(this);
    }

    public long uniqueLoanId(){
        long theRandomNum = (long) (Math.random()*Math.pow(10,10));
        return theRandomNum;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(getApplicationContext(),loanTypeValue[position] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.previous:
                startActivity(new Intent(SelectLoanType.this, LoansCategory.class));
                break;

            case R.id.next:
                startActivity(new Intent(SelectLoanType.this, PersonalLoanForm.class));
        }

    }
}
