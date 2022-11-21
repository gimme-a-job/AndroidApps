package com.example.fukusyu0501;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickShowMessage());

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "ボタン２が押されました");
            }
        });

    }

    private class OnClickShowMessage implements View.OnClickListener {


        @Override
        public void onClick(View view) {

            Log.d("MainActivity", "ボタンが押されました");


        }


    }


}