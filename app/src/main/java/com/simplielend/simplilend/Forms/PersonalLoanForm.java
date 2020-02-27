package com.simplielend.simplilend.Forms;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.Fill_in_details;
import com.simplielend.simplilend.Loans.UnderReview;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class PersonalLoanForm extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    //var
    int inc1;
    int t=0;
    int total=0;
    ImageView add_new_sources,delete_new_sources;
    int textviewcount=1;
    EditText new_source,primar_income;
    TextView total_income,viewme;
    LinearLayout mlayout,new_sources;
    Spinner employmentType,officialAddressType, state, city, district, otherSourceOfIncome, coApplicant, relationshipWithCoApplicant;
    ArrayAdapter employmentTypeAdapter,officialAddressTypeAdapter, stateAdapter, cityAdapter, districtAdapter, otherSourceOfIncomeAdapter, coApplicantAdapter, relationshipWithCoApplicantAdapter;
    ArrayList<EditText> sourceEditText = new ArrayList<>();
    ArrayList<EditText> incomeEditText = new ArrayList<>();
    Button add_income;
    TextView next;
    EditText businessname,designaton_name,address_1,pincode,total_monthly_expense;
    //Constants
    private String[] employmentTypeVal = {
            "Primary Employment Type *",
            "Govt. Employee",
            "Private Sector Employee",
            "Self-Employed Professional",
            "Self-Employed Non-Professional"};

    private String[] officialAddressVal = {
            "Official Address Type",
            "Shop",
            "Home Office",
            "Godown / Warehouse",
            "Factory",
            "Showroom",
            "Corporate Office",
            "Govt. Office",
            "Industrial Shed"};

    private String[] stateVal = {
            "Select State",
            "Andaman & Nicobar Island",
            "Assam",
            "Arunanchal Pradesh",
            "Andhra Pradesh",
            "Bihar",
            "Rajasthan",
            "Uttar Pradesh",
            "Madhya Pradesh"};

    private String[] cityVal = {
            "Select City",
            "Lucknow",
            "New Delhi",
            "Allahabad",
            "Kanpur",
            "Itawa"};

    private String[] districtVal = {
            "Select City",
            "Lucknow",
            "New Delhi",
            "Allahabad",
            "Kanpur",
            "Itawa"};

    private String[] otherSourceOfIncomeVal = {
            "Select if any other sources of Income",
            "Yes",
            "No"};

    private String[] coApplicantVal = {
            "Select if any co-applicant",
            "Yes",
            "No"};

    private String[] relationshipWithCoApplicantVal = {
            "Relationship with co-applicant",
            "Father",
            "Mother",
            "Spouse",
            "Son",
            "Daughter",
            "Other"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_personal_loan_form);
        mlayout = findViewById(R.id.mlayout);
        add_new_sources = findViewById(R.id.add_new_sources);
        new_sources = findViewById(R.id.new_sources_container);
        delete_new_sources = findViewById(R.id.delete_new_sources);
        primar_income = findViewById(R.id.primary_income);
         add_income=findViewById(R.id.tot);
         viewme=findViewById(R.id.viewme);
         next=findViewById(R.id.next);
         businessname=findViewById(R.id.business_name);
         designaton_name=findViewById(R.id.designaton_name);
         address_1=findViewById(R.id.address_1);
         pincode=findViewById(R.id.pincode);
         total_monthly_expense=findViewById(R.id.total_monthly_expense);
         next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 startActivity(new Intent(PersonalLoanForm.this, Fill_in_details.class).putExtra("key",businessname.getText().toString()).putExtra("key1",designaton_name.getText().toString()).putExtra("key2",address_1.getText().toString()).putExtra("key3",pincode.getText().toString()).putExtra("key4",total_monthly_expense.getText().toString()).putExtra("key5",primar_income.getText().toString()).putExtra("key6",employmentType.getSelectedItem().toString()).putExtra("key7",officialAddressType.getSelectedItem().toString()).putExtra("key8",state.getSelectedItem().toString()).putExtra("key9",district.getSelectedItem().toString()).putExtra("key10",coApplicant.getSelectedItem().toString()).putExtra("key11",relationshipWithCoApplicant.getSelectedItem().toString()));
             }
         });
        add_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int summy = total+inc1;
                if (incomeEditText.isEmpty())
                {
                    summy=inc1;
                }

                viewme.setText(String.valueOf(summy));



            }
        });

         primar_income.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {

             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {

               if (s.toString().equals(""))
               {
                   return;
               }
                  inc1=Integer.parseInt(s.toString());

             }

             @Override
             public void afterTextChanged(Editable s) {

             }
         });

      /*   total_income.setOnTouchListener(new View.OnTouchListener() {
             @Override
             public boolean onTouch(View v, MotionEvent event) {

                 int sum=t+inc1;
                 total_income.setText(sum);
                 return false;
             }
         });

       */
        delete_new_sources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i=incomeEditText.size();
                int f=sourceEditText.size();
                Log.d("original size income",String.valueOf(i));
                Log.d("original size source",String.valueOf(f));

                if(incomeEditText.isEmpty()&&sourceEditText.isEmpty())
                {
                    return;
                }
               else {
                    incomeEditText.remove(i-1);
                    sourceEditText.remove(f-1);
                    new_sources.removeViewAt(f-1);
                    new_sources.removeViewAt(i - 1);
                  Log.d("size income", String.valueOf(incomeEditText.size()));
                  Log.d("size source",String.valueOf(incomeEditText.size()));
                }

            }
        });


        add_new_sources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



//             for (i=0;i<textviewcount;i++)
//          {
//              final EditText [] source = new EditText[10];
//              final EditText [] income=new EditText[10];

                EditText source = new EditText(getApplicationContext());
                sourceEditText.add(source);
                EditText income = new EditText(getApplicationContext());
                incomeEditText.add(income);

                source.setHint("New Source");
                source.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                income.setHint("Income");
                income.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                new_sources.addView(source);
                new_sources.addView(income);



                for (int j=0;j<incomeEditText.size();j++)
                {
                    Log.d("value of j", String.valueOf(j));
                    EditText ak= incomeEditText.get(j);
                    if(!ak.getText().toString().equals(""))


                        {
                            int k = Integer.parseInt(ak.getText().toString());

                            total = total + k;

                            Log.d("value",String.valueOf(total));

                        }


                    else
                    {
                        return;
                    }




                }



            }
        });
        initialize();


    }





    public void initialize(){
        employmentType = (Spinner) findViewById(R.id.employment_type);
        employmentType.setOnItemSelectedListener(this);
        employmentTypeAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,employmentTypeVal);
        employmentTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        employmentType.setAdapter(employmentTypeAdapter);

        officialAddressType = (Spinner) findViewById(R.id.official_address_type);
        officialAddressType.setOnItemSelectedListener(this);
        officialAddressTypeAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,officialAddressVal);
        officialAddressTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        officialAddressType.setAdapter(officialAddressTypeAdapter);

        state = (Spinner) findViewById(R.id.state);
        state.setOnItemSelectedListener(this);
        stateAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,stateVal);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(stateAdapter);


        district = (Spinner) findViewById(R.id.district);
        district.setOnItemSelectedListener(this);
        districtAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,districtVal);
        districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        district.setAdapter(districtAdapter);

        otherSourceOfIncome = (Spinner) findViewById(R.id.other_sources_of_income);
        otherSourceOfIncome.setOnItemSelectedListener(this);
        otherSourceOfIncomeAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,otherSourceOfIncomeVal);
        otherSourceOfIncomeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        otherSourceOfIncome.setAdapter(otherSourceOfIncomeAdapter);

        coApplicant = (Spinner) findViewById(R.id.co_applicant);
        coApplicant.setOnItemSelectedListener(this);
        coApplicantAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,coApplicantVal);
        coApplicantAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coApplicant.setAdapter(coApplicantAdapter);

        relationshipWithCoApplicant = (Spinner) findViewById(R.id.relationship_with_co_applicant);
        relationshipWithCoApplicant.setOnItemSelectedListener(this);
        relationshipWithCoApplicantAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,relationshipWithCoApplicantVal);
        relationshipWithCoApplicantAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        relationshipWithCoApplicant.setAdapter(relationshipWithCoApplicantAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
