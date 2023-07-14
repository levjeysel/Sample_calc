package com.example.sample_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private ImageButton add;
    private ImageButton mul;
    private ImageButton sub;
    private ImageButton div;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.editTextNumberSigned);
        num2 = (EditText) findViewById(R.id.editTextNumberSigned2);
        add = (ImageButton) findViewById(R.id.imageButton);
        mul = (ImageButton) findViewById(R.id.imageButton2);
        sub = (ImageButton) findViewById(R.id.imageButton3);
        div = (ImageButton) findViewById(R.id.imageButton4);
        ans = (TextView) findViewById(R.id.textView);

        num1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if (TextUtils.isEmpty(num1.getText().toString()))
                    num1.setText("0");

            }
        });

        num2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if (TextUtils.isEmpty(num2.getText().toString()))
                    num2.setText("0");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float sum = number1 + number2;
                ans.setText("The answer is " + String.valueOf(sum));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float pro = number1 * number2;
                ans.setText("The answer is " + String.valueOf(pro));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float diff = number1 - number2;
                ans.setText("The answer is " + String.valueOf(diff));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                if (number2 == 0)
                    ans.setText("Number 2 should not be zero.");
                else {
                    float quo = number1 / number2;
                    ans.setText("The answer is " + String.valueOf(quo));
                }

            }
        });

    }
}