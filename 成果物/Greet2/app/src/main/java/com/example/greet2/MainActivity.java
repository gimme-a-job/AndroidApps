package com.example.greet2;

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

        TextView textView = (TextView) findViewById(R.id.textView);

        switch (view.getId())
        {
            case R.id.button1:
                textView.setText(R.string.greetingAsa);
                break;
            case R.id.button2:
                textView.setText(R.string.greetingHiru);
                break;
            case R.id.button3:
                textView.setText(R.string.greetingYoru);
                break;
        }
    }

}