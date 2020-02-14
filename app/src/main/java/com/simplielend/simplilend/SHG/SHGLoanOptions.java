package com.simplielend.simplilend.SHG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.simplielend.simplilend.Home.LoansCategory;
import com.simplielend.simplilend.R;

public class SHGLoanOptions extends AppCompatActivity implements View.OnClickListener {
Button goback;
ImageView exit;
LinearLayout viewexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shgloan_options);
        goback=findViewById(R.id.goback);
        viewexit=findViewById(R.id.view_edit);
        viewexit.setOnClickListener(this);
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

             case R.id.view_edit:
                 startActivity(new Intent(SHGLoanOptions.this,ViewEditSHG.class));
                 break;
         }

    }

    }
