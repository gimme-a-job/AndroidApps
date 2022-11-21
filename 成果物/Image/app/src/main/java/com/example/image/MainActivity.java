package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //ImageViewのリソース情報を取得
    ImageView myImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageViewのリソース情報を取得
        myImg =findViewById(R.id.imageView);

    }

    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button_higanbana:
                //ImageViewに画像をセット
                myImg.setImageResource(R.drawable.flower_higanbana);
                break;
            case R.id.button_yuri:
                //ImageViewに画像をセット
                myImg.setImageResource(R.drawable.flower_yuri);
                break;
        }

    }
}