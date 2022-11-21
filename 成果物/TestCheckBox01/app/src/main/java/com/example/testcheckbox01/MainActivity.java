package com.example.testcheckbox01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox chk1,chk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1 = findViewById(R.id.checkBox);
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.d("MainActivity", getString(R.string.chk_title2)+ "クリック");

                if(b)
                {
                    Log.d("MainActivity", getString(R.string.chk_title2)+ "オン");
                }
                else
                {
                    Log.d("MainActivity", getString(R.string.chk_title2)+ "オフ");
                }
            }
        });

        chk2 = findViewById(R.id.checkBox2);
        chk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", getString(R.string.chk_title2)+"クリック");
            }
        });

    }
}