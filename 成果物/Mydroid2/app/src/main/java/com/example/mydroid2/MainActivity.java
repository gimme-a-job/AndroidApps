package com.example.mydroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dispBtn = findViewById(R.id.button);
        dispBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //テキストボックスの情報(リソース)を取得する
        TextView msgText=findViewById(R.id.textView1);
        //テキストボックスのメソッドを利用して表示
        msgText.setText("ようこそ Androidの世界へ");
    }
}