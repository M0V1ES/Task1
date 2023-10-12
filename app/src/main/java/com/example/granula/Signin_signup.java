package com.example.granula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class Signin_signup extends AppCompatActivity {

        private Button button;
        private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_signup);
        button = (Button) findViewById(R.id.button);
        text = (EditText) findViewById(R.id.editTextTextEmailAddress);
        text.addTextChangedListener(new TextWatcher() {
                @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button.setEnabled(true);
                button.setBackgroundColor(getColor(R.color.blue));
            }

            @Override
            public void afterTextChanged(Editable s) {
            if(s.length() == 0){
                button.setEnabled(false);
                button.setBackgroundColor(getColor(R.color.lowblue));
            }
            }
        });
    }
}