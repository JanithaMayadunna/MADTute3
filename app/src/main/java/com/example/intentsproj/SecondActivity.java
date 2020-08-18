package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTextNumber1;
    EditText editTextNumber2;
    TextView textView;

    String num1;
    String num2;

    int n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextNumber1 = findViewById(R.id.nmb1);
        editTextNumber2 = findViewById(R.id.nmb2);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();

        num1 = intent.getStringExtra("n1");
        num2 = intent.getStringExtra("n2");

        editTextNumber1.setText(num1);
        editTextNumber2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

    }

    public void add(View view){
        textView.setText(num1 + "+" + num2 +"=" +(n1+n2));
    }

    public void sub(View view){
        textView.setText(num1 + "-" + num2 +"=" +(n1-n2));
    }

    public void Multi(View view){
        textView.setText(num1 + "*" + num2 +"=" +(n1*n2));
    }

    public void divide(View view){ textView.setText(num1 + "/" + num2 + "=" +(n1/n2)); }}