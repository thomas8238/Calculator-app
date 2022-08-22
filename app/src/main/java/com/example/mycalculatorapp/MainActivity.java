package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberSumTV = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("Answer:  " + sum);
    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberProductTV = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int product = num1 * num2;

        numberProductTV.setText("Answer:  " + product);
    }
    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberDifferenceTV = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int difference = num1 - num2;

        numberDifferenceTV.setText("Answer:  " + difference);
    }
    public void findQuotient(View view) {
        DecimalFormat n = new DecimalFormat("##.0000");
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberQuotientTV = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        double quotient = (double)num1/num2;


        numberQuotientTV.setText("Answer:  " + n.format(quotient));
    }
}