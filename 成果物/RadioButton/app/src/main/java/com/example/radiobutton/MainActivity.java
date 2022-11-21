package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RadioGroupのリソース情報の取得
        RadioGroup radio =findViewById(R.id.radioGroup);

        radio.setOnCheckedChangeListener((this));

    }

    public void onCheckedChanged(RadioGroup group, int checkedId) //"https://techbooster.org/android/ui/9640/"より
    {
        // どれも選択されていなければidには-1が入ってくる
        if (-1 == checkedId) {
            Toast.makeText(MainActivity.this,
                    "クリアされました",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,
                    ((RadioButton)findViewById(checkedId)).getText()
                            + "が選択されました",
                    Toast.LENGTH_SHORT).show();
        }
    }



}