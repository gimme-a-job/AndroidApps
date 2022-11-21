package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Animation anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView img=findViewById(R.id.imageView);
//        Animation anime = AnimationUtils.loadAnimation(this, R.anim.myrotate1);
        img=findViewById(R.id.imageView);
        anime = AnimationUtils.loadAnimation(this, R.anim.myrotate1);

        img.startAnimation(anime);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event)
    {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                img.startAnimation(anime);
                break;

            case MotionEvent.ACTION_MOVE:
                //何もしない
                break;

            case MotionEvent.ACTION_UP:
                //何もしない
                break;


        }//switch文終わり

        return true;

    }//"onTouchEvent"終わり

}