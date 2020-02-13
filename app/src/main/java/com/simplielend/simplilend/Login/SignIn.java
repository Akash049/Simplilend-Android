package com.simplielend.simplilend.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.simplielend.simplilend.Home.Dashboard;
import com.simplielend.simplilend.R;

public class SignIn extends AppCompatActivity implements View.OnClickListener {

    //var
    TextView signinBtn, loginWithOtpBtn, forgotPasswordBtn;
    EditText emailEntry, passwordEntry;
    TextView logotp,forgot_password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin);
        initialize();
    }

    public void initialize(){
        signinBtn = (TextView)findViewById(R.id.signin_btn);
        signinBtn.setOnClickListener(this);
        emailEntry = (EditText)findViewById(R.id.email_data_entry);
        passwordEntry = (EditText)findViewById(R.id.password_data_entry);
        forgot_password=findViewById(R.id.forgot_password);
        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this,ForgotPassword.class));
            }
        });
        logotp=(TextView)findViewById(R.id.log_otp);
        logotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, OTPLogin.class));
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.signin_btn:
                if(emailEntry.getText().toString().equals("akash@wiztute.com") &&
                        passwordEntry.getText().toString().equals("qwerty")
                    ){
                    Toast.makeText(getApplicationContext(),"You have successfully logged in",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignIn.this, Dashboard.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid credentials",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
