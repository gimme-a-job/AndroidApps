package com.example.mycanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.example.mycanvas.MyView; //自作した別クラスを利用できるようにする

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); //(コメントアウトすることで)デフォルトのGUI画面は表示させない
        MyView myCustomView = new MyView(this); //描画用オブジェクトの生成
        setContentView(myCustomView); //Activity上に描画する
    }
}