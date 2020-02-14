package com.simplielend.simplilend.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.ConversationActions;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.simplielend.simplilend.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class OTPLogin extends AppCompatActivity implements View.OnClickListener {
    EditText mob_num,otp;
    Button gen_otp;
    RequestQueue requestQueue;
    String url, url2;
    Button resetpass;
    ImageView back;
    TextView resend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otplogin);
        url = "http://3.88.131.77:8080/user/send_otp/";
        url2 = " http://3.88.131.77:8080/user/verify_otp/";
        back = findViewById(R.id.back);
        otp=findViewById(R.id.otp);
        mob_num = findViewById(R.id.mobile_number);
        resend=findViewById(R.id.resend);
        resend.setOnClickListener(this);
        gen_otp = findViewById(R.id.gen_otp);
        resetpass = findViewById(R.id.resetpass);
        resetpass.setOnClickListener(this);
        gen_otp.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    private void getOTP() {
        try {
            requestQueue = Volley.newRequestQueue(this);
            StringRequest postRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.d("Response", response);
                    try {
                        JSONObject responseObject = new JSONObject(response);
                        String status = responseObject.optString("status");
                        if (status.equals("1")) {
                            //otp_process.setText("OTP sent.");
                            Toast.makeText(getApplicationContext(), "OTP sent", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Server Error", Toast.LENGTH_SHORT).show();
                        }

                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), "Could not send the OTP please try again.", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            // As of f605da3 the following should work
                            NetworkResponse response = error.networkResponse;
                            Log.d("Response error", error.toString());
                            Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
            ) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> loginParams = new HashMap<String, String>();
                    loginParams.put("mobile", mob_num.getText().toString());
                    return loginParams;
                }
            };
            requestQueue.add(postRequest);
        } catch (Exception e) {

        }
    }

    private void verifyOTP() {
        try {
            requestQueue = Volley.newRequestQueue(this);
            StringRequest getRequest = new StringRequest(Request.Method.POST,url2, new Response.Listener<String>() {
                @Override

                public void onResponse(String response) {
                    Log.d("Response", response);
                    try {
                        JSONObject responseObject = new JSONObject(response);
                        String status = responseObject.optString("status");
                        if (status.equals("1")) {
                            //otp_process.setText("OTP sent.");
                            startActivity(new Intent(OTPLogin.this,ResetPassword.class));
                            Toast.makeText(getApplicationContext(), "OTP verified", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Incorrect OTP", Toast.LENGTH_SHORT).show();
                        }

                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), "Could not send the OTP please try again.", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                }

            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            // As of f605da3 the following should work
                            NetworkResponse response = error.networkResponse;
                            Log.d("Response error", error.toString());
                            Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
            ) {
                @Override
                protected Map<String, String> getParams() {
                    Map<String, String> loginParams = new HashMap<String, String>();
                    loginParams.put("mobile", mob_num.getText().toString());
                    loginParams.put("otp", otp.getText().toString());
                    return loginParams;
                }
            };
            requestQueue.add(getRequest);
        } catch (Exception e) {

        }
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.resend:
                getOTP();
                 break;
            case R.id.resetpass:
                verifyOTP();
                break;
            case R.id.gen_otp:
                getOTP();
                break;
            case R.id.back:
                startActivity(new Intent(OTPLogin.this,SignIn.class));
                break;

        }

    }
}


