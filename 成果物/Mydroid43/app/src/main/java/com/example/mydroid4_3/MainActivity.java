package com.example.mydroid4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        TextView txt1 = findViewById(R.id.textView1);
        TextView txt2 = findViewById(R.id.textView2);

        switch (view.getId())
        {
            case R.id.button_Xfer:
                EditText edit1 = findViewById(R.id.editText1);
                EditText edit2 = findViewById(R.id.editText2);
                txt1.setText(edit1.getText());
                txt2.setText(edit2.getText());
                break;

            case R.id.button_Xchange:
                String temp_str1 = txt1.getText().toString();
                String temp_str2 = txt2.getText().toString();
                txt1.setText(temp_str2);
                txt2.setText(temp_str1);
                break;


        }

    }
}