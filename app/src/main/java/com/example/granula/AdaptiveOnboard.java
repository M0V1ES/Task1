package com.example.granula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class AdaptiveOnboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptive_onboard);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AdaptiveOnboard.this, AdaptiveOnboard2.class);
                startActivity(intent);
            }
        }, 5000);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, AdaptiveOnboard2.class);
        startActivity(intent);
    }
}
