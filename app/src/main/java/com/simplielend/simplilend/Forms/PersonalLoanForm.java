package com.simplielend.simplilend.Forms;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.R;

public class PersonalLoanForm extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    //var
    Spinner employmentType,officialAddressType, state, city, district, otherSourceOfIncome, coApplicant, relationshipWithCoApplicant;
    ArrayAdapter employmentTypeAdapter,officialAddressTypeAdapter, stateAdapter, cityAdapter, districtAdapter, otherSourceOfIncomeAdapter, coApplicantAdapter, relationshipWithCoApplicantAdapter;

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

        city = (Spinner) findViewById(R.id.city);
        city.setOnItemSelectedListener(this);
        cityAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,cityVal);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(cityAdapter);

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
