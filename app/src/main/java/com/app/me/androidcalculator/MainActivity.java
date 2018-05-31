package com.app.me.androidcalculator;

//https://www.youtube.com/watch?v=kp0DefpSMYw

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring variables
    TextView Result;
    EditText Number1, Number2;
    Button ADD, SUBTRACT, MULTIPLY, DIVIDE;

    float result_num;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recording variables
        Result = (TextView)findViewById(R.id.result);

        Number1 = (EditText)findViewById(R.id.Number1);
        Number2 = (EditText)findViewById(R.id.Number2);

        ADD = (Button)findViewById(R.id.add);
        SUBTRACT = (Button)findViewById(R.id.subtract);
        MULTIPLY = (Button)findViewById(R.id.multiply);
        DIVIDE = (Button)findViewById(R.id.divide);

        //methods
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_num = num1 + num2;
                Result.setText(String.valueOf(result_num));

            }
        });

        SUBTRACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_num = num1 - num2;
                Result.setText(String.valueOf(result_num));

            }
        });

        MULTIPLY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_num = num1 * num2;
                Result.setText(String.valueOf(result_num));

            }
        });

        DIVIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());
                result_num = num1 / num2;
                Result.setText(String.valueOf(result_num));

            }
        });

    }
}
