package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clear(View view) {
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        number1ET.setText("");
        number2ET.setText("");
    }
    public void findSum(View view) {
        DecimalFormat n = new DecimalFormat("##.0000");
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberSumTV = findViewById(R.id.result);
        if(number1ET.getText().length() == 0 || number2ET.getText().length() == 0) {
            toastNoVal(view);
            return;
        }
        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;
            if(sum%1 ==0) {
                numberSumTV.setText("Answer:  " + (int)sum);
            } else {
                numberSumTV.setText("Answer:  " + n.format(sum));
            }
        } catch (Exception e) {
            toastExecute(view);
        }

    }
    public void findProduct(View view) {
        DecimalFormat n = new DecimalFormat("##.0000");
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberProductTV = findViewById(R.id.result);
        if(number1ET.getText().length() == 0 || number2ET.getText().length() == 0) {
            toastNoVal(view);
            return;
        }
        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double product = num1 * num2;
            if(product%1 ==0) {
                numberProductTV.setText("Answer:  " + (int)product);
            } else {
                numberProductTV.setText("Answer:  " + n.format(product));
            }
        } catch (Exception e) {
            toastExecute(view);
        }

    }
    public void findDifference(View view) {
        DecimalFormat n = new DecimalFormat("##.0000");
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberDifferenceTV = findViewById(R.id.result);
        if(number1ET.getText().length() == 0 || number2ET.getText().length() == 0) {
            toastNoVal(view);
            return;
        }
        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double difference = num1 - num2;
            if(difference%1 ==0) {
                numberDifferenceTV.setText("Answer:  " + (int)difference);
            } else {
                numberDifferenceTV.setText("Answer:  " + n.format(difference));
            }
        } catch (Exception e) {
            toastExecute(view);
        }

    }
    public void findQuotient(View view) {
        DecimalFormat n = new DecimalFormat("##.0000");
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberQuotientTV = findViewById(R.id.result);
        if(number1ET.getText().length() == 0 || number2ET.getText().length() == 0) {
            toastNoVal(view);
            return;
        }
        try {

            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double quotient = (double) num1/num2;
            if(quotient%1 ==0) {
                numberQuotientTV.setText("Answer:  " + (int)quotient);
            } else {
                numberQuotientTV.setText("Answer:  " + n.format(quotient));
            }
        } catch (Exception e) {
            toastExecute(view);
        }
    }
    public void toastExecute(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "Numbers are too large", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void toastNoVal(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "Enter a value into each text box", Toast.LENGTH_SHORT);
        toast.show();
    }
}