package com.simplielend.simplilend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.simplielend.simplilend.Home.LoansCategory;

public class SHGLoanOptions extends AppCompatActivity implements View.OnClickListener {
Button goback;
ImageView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shgloan_options);
        goback=findViewById(R.id.goback);
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(this);
        goback.setOnClickListener(this);



}

    @Override
    public void onClick(View v) {
         int id = v.getId();
         switch (id)
         {
             case R.id.exit:
                 startActivity(new Intent(SHGLoanOptions.this,LoansCategory.class));
                 break;

             case R.id.goback:
                 startActivity(new Intent(SHGLoanOptions.this,LoansCategory.class));
                 break;
         }

    }

    }
