package com.simplielend.simplilend.DrawerActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.R;

public class DSA_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsa__profile);
    }

    public void dsaback(View view) {
        startActivity(new Intent(DSA_Profile.this, Dashboard.class));
    }
}
