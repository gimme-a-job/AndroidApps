package com.example.mysoundplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //音楽リソースをMediaPlayerにセット
        myPlayer=MediaPlayer.create(getApplicationContext(), R.raw.music1);
    }

    public void startMusic(View v)
    {
        myPlayer.start();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        myPlayer.release(); //アプリケーション終了時に解放
    }

}