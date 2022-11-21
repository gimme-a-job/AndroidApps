package com.example.hukushu0303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }


    public void onClick(View view) {

        TextView textview = (TextView)findViewById(R.id.textView);

        switch(view.getId())
        {
            case R.id.button:
                textview.setText(R.string.txt1);
                break;
            case R.id.button2:
                textview.setText(R.string.txt2);
                break;
            case R.id.button3:
                textview.setText(R.string.txt3);
                break;
        }

    }
}