package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText num1 = (EditText) findViewById(R.id.editText1);
        EditText num2 = (EditText) findViewById(R.id.editText2);
        TextView sum = (TextView) findViewById(R.id.textView4);

        //"https://www.ipentec.com/document/android-create-simple-calc-application"より
        try {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            int c = a + b;

        sum.setText(String.valueOf(c));
        }
        catch (Exception e)
        {
//            Toast.makeText(MainActivity.this,
//                    e.toString(),
//                    Toast.LENGTH_SHORT).show();

            sum.setText(String.valueOf(e));
            Toast.makeText(MainActivity.this,
                    "入力できるデータは正/負の整数のみ！",
                    Toast.LENGTH_SHORT).show();
        }

    }
}