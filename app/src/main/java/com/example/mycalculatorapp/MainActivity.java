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
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        boolean mod = false;
        TextView numberSumTV = findViewById(R.id.result);
        if(number2ET.getText().length() == 0) {
            number2ET.setText("0");
            mod = true;
        }
        if(number1ET.getText().length() == 0) {
            number1ET.setText("0");
            mod = true;
        }
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;
            numberSumTV.setText("Answer:  " + sum);
        } catch (Exception e) {
            toastExecute(view);
        }
        if(mod) {
            clear(view);
        }

    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberProductTV = findViewById(R.id.result);
        boolean mod = false;
        if(number1ET.getText().length() == 0 && number2ET.getText().length() == 0) {
            number1ET.setText("0");
            number2ET.setText("0");
            mod = true;
        }
        if(number2ET.getText().length() == 0) {
            number2ET.setText("1");
            mod = true;
        }
        if(number1ET.getText().length() == 0) {
            number1ET.setText("1");
            mod = true;
        }

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int product = num1 * num2;
            numberProductTV.setText("Answer:  " + product);
        } catch (Exception e) {
            toastExecute(view);
        }
        if(mod) {
            clear(view);
        }


    }
    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberDifferenceTV = findViewById(R.id.result);
        boolean mod = false;
        if(number2ET.getText().length() == 0) {
            number2ET.setText("0");
            mod = true;
        }
        if(number1ET.getText().length() == 0) {
            number1ET.setText("0");
            mod = true;
        }
        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int difference = num1 - num2;
            numberDifferenceTV.setText("Answer:  " + difference);
        } catch (Exception e) {
            toastExecute(view);
        }
        if(mod) {
            clear(view);
        }



    }
    public void findQuotient(View view) {
        DecimalFormat n = new DecimalFormat("##.0000");
        EditText number1ET = findViewById(R.id.firstValue);
        EditText number2ET = findViewById(R.id.SecondValue);
        TextView numberQuotientTV = findViewById(R.id.result);
        boolean mod = false;
        if(number1ET.getText().length() == 0 && number2ET.getText().length() == 0) {
            number1ET.setText("0");
            number2ET.setText("0");
            mod = true;
        }
        if(number2ET.getText().length() == 0) {
            number2ET.setText("1");
            mod = true;
        }
        if(number1ET.getText().length() == 0) {
            number1ET.setText("1");
            mod = true;
        }

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            double quotient = (double) num1 / num2;
            numberQuotientTV.setText("Answer:  " + n.format(quotient));
        } catch (Exception e) {
            toastExecute(view);
        }
        if(mod) {
            clear(view);

        }
    }
    public void toastExecute(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "Numbers are too large", Toast.LENGTH_SHORT);
        toast.show();
    }
}