package com.example.mydroid2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
//public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button dispBtn = findViewById(R.id.button);
//        dispBtn.setOnClickListener(this);
    }

    public void onClick(View view) {

//テキストボックスの情報(リソース)を取得する
        TextView msgText=findViewById(R.id.textView1);

        String txt_current = msgText.getText().toString();
        String[] titles = {getString(R.string.view_title1).toString(), getString(R.string.view_title2).toString()};


//switch文は使用不可？
        ////        switch (msgText.getText().toString())
//        switch (msgText.getText().toString()) //"https://kokufu.blogspot.com/2012/11/ridxxx-switch-case-expressions-must-be.html"より
//        {
//
////            case getString(R.string.view_title1).toString():
//            case titles[0]:
//                break;
////            case getString(R.string.view_title2).toString():
//            case titles[1]:
//                    break;

        if (txt_current == titles[0])
        {
            //テキストボックスのメソッドを利用して表示
            msgText.setText(titles[1]);
        }
        else if(txt_current == titles[1])
        {
            //テキストボックスのメソッドを利用して表示
            msgText.setText(titles[0]);
        }
        else
        {
            //テキストボックスのメソッドを利用して表示
            msgText.setText(titles[0]);
        }



    }
}