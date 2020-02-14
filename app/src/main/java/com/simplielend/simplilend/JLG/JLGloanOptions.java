package com.simplielend.simplilend.JLG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.simplielend.simplilend.Home.LoansCategory;
import com.simplielend.simplilend.R;

public class JLGloanOptions extends AppCompatActivity implements View.OnClickListener {

    Button backtoscreen;
    ImageView exit;
    LinearLayout view_edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jlgloan_options);
        backtoscreen=findViewById(R.id.goback);
        exit=findViewById(R.id.exit);
        view_edit=findViewById(R.id.view_edit);
        view_edit.setOnClickListener(this);
        backtoscreen.setOnClickListener(this);
        exit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.goback:
                startActivity(new Intent(JLGloanOptions.this, LoansCategory.class));
              break;

            case R.id.exit:
                startActivity(new Intent(JLGloanOptions.this,LoansCategory.class));
                break;

            case R.id.view_edit:
                startActivity(new Intent(JLGloanOptions.this,ViewEditJLG.class));
                break;
        }
    }
}
