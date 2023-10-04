package com.example.granula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdaptiveOnboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptive_onboard);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, AdaptiveOnboard2.class);
        startActivity(intent);
    }
}