package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView myImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImg = findViewById(R.id.imageView);

    }

    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button_alpha: //透過
                //Tweenアニメーション
//                myImg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.myalpha));
                //プロパテーアニメーション
                myImg.animate().alpha((float) Math.random());
                break;

            case R.id.button_scale: //拡大/縮小
                //Tweenアニメーション
//                myImg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.myscale));
                //プロパテーアニメーション
                myImg.animate().scaleX((float) Math.random()*2+0.1f).scaleY((float) Math.random()*2+0.1f);
                break;

            case R.id.button_rotate: //回転
                //Tweenアニメーション
//                myImg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.myrotate));
                //プロパテーアニメーション
                myImg.animate().rotation((float) new Random().nextInt(360)).setDuration(1000);
                break;

            case R.id.button_xlate: //移動
                //Tweenアニメーション
//                myImg.startAnimation(AnimationUtils.loadAnimation(this, R.anim.myxlate));
                //プロパテーアニメーション
                myImg.animate().translationX(new Random().nextInt(300)).translationY(new Random().nextInt(300));
                break;

        }

    }
}