package com.example.granula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EnterEmail extends AppCompatActivity {
    private EditText text,text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_email);
        final int[] time = {59};
        TextView textTimer = (TextView)findViewById(R.id.textView19);

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                textTimer.setText("Отправить код повторно можно \n будет через "+checkDigit(time[0])+" секунд");
                time[0]--;
            }

            public void onFinish() {
                textTimer.setText("Отправить еще раз");
            }

        }.start();


        text = (EditText) findViewById(R.id.editTextText);
        text1 = (EditText) findViewById(R.id.editTextText1);
        text2 = (EditText) findViewById(R.id.editTextText2);
        text3 = (EditText) findViewById(R.id.editTextText3);

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
               if(text.getText().length() == 1)  {
                   text1.requestFocus();
                   text1.addTextChangedListener(new TextWatcher() {
                       @Override
                       public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                       @Override
                       public void onTextChanged(CharSequence s, int start, int before, int count) {
                           if(text1.getText().length() == 1)  {
                               text2.requestFocus();
                               text2.addTextChangedListener(new TextWatcher() {
                                   @Override
                                   public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                                   @Override
                                   public void onTextChanged(CharSequence s, int start, int before, int count) {
                                       if(text2.getText().length() == 1)  {
                                           text3.requestFocus();
                                       }
                                   }
                                   @Override
                                   public void afterTextChanged(Editable s) {}
                               });
                           }
                       }
                       @Override
                       public void afterTextChanged(Editable s) {}
                   });
               }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });
    }
    public void onClick(View view){
        Intent intent = new Intent(this, Signin_signup.class);
        startActivity(intent);
    }
    public String checkDigit(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }
}