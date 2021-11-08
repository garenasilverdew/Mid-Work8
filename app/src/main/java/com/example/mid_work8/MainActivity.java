package com.example.mid_work8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText height,weight;
    private Button bmi;
    private TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        num = (TextView)findViewById(R.id.num);
    }
    public void bmi(View view) {
        float total = (Float.parseFloat(weight.getEditableText().toString()))/(Float.parseFloat(height.getEditableText().toString())*Float.parseFloat(height.getEditableText().toString()));
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        intent.putExtra("BMI",Float.toString(total));
        height.setText("");
        weight.setText("");
        startActivity(intent);
    }
}