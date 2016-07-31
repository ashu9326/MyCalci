package com.example.ashugupta.mycalci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void addTwoNumber(View view) {
        String firstNumberString = editText1.getText().toString();
        String secondNumberString = editText2.getText().toString();
        int num1 = Integer.parseInt(firstNumberString);
        int num2 = Integer.parseInt(secondNumberString);
        int sum = num1 + num2;
        textView.setText("" + sum);
    }

    public void subTwoNumber(View view) {
        String firstNumberString = editText1.getText().toString();
        String secondNumberString = editText2.getText().toString();
        int num1 = Integer.parseInt(firstNumberString);
        int num2 = Integer.parseInt(secondNumberString);
        int sub = num1 - num2;
        textView.setText("" + sub);
    }

    public void mulTwoNumber(View view) {
        String firstNumberString = editText1.getText().toString();
        String secondNumberString = editText2.getText().toString();
        float num1 = Float.parseFloat(firstNumberString);
        float num2 = Float.parseFloat(secondNumberString);
        float mul = num1 * num2;
        textView.setText("" + mul);
    }

    public void divTwoNumber(View view) {
        String firstNumberString = editText1.getText().toString();
        String secondNumberString = editText2.getText().toString();
        double num1 = Double.parseDouble(firstNumberString);
        double num2 = Double.parseDouble((secondNumberString));
        double div = num1 / num2;
        textView.setText("" + div);
    }
}