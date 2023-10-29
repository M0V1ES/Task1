package com.example.granula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class AdaptiveOnboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptive_onboard2);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, Signin_signup.class);
        startActivity(intent);
    }
    public void onClick1(View view){
        Intent intent = new Intent(this, AdaptiveOnboard3.class);
        startActivity(intent);
    }
}