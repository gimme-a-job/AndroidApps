package com.example.omikuji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView myImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageViewのリソース情報を取得
        myImg = findViewById(R.id.imageView);

        myImg.setVisibility(View.INVISIBLE);

    }

    public void onClick(View view) {

        myImg.setVisibility(View.VISIBLE);

        switch (new Random().nextInt(4))
        {
            case 0: //大吉
                myImg.setImageResource(R.drawable.omikuji_daikichi);
                break;
            case 1: //吉
                myImg.setImageResource(R.drawable.omikuji_kichi);
                break;
            case 2: //末吉
                myImg.setImageResource(R.drawable.omikuji_suekichi);
                break;
            case 3: //凶
                myImg.setImageResource(R.drawable.omikuji_kyou);
                break;
        }

    }
}