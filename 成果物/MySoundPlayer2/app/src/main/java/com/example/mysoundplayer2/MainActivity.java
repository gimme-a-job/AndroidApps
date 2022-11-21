package com.example.mysoundplayer2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myPlayer;

    Spinner spinner;

    TextView textView; //音楽の長さ

    Files files = new Files();
//    Files files;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        textView = findViewById(R.id.textView);

//        files = new Files();

        //"https://tkm0on.hatenablog.com/entry/2015/05/19/163735"より

        // Adapterの作成
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Adapterにアイテムを追加
        for (int i=0;i<files.getSize();i++) {
            adapter.add(files.getFileName(i));
        }

        // SpinnerにAdapterを設定
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //音楽リソースをMediaPlayerにセット  //曲の長さを取得して表示
                setMusic(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //  そんなことある？
            }

        });

//        //実装しようとするだけでクラッシュ
//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                stopMusic();
//            }
//        });

//        //実装しようとするだけでクラッシュ
//        spinner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                stopMusic();
//            }
//        });

        //曲再生中にスピナーを弄ると、前の曲止められなかったり、再生被ったりするため
        spinner.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                stopMusic();
                return false;
            }
        });


    }



    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button_play:
                startMusic();
                break;

            case R.id.button_pause:
                pauseMusic();
                break;

            case R.id.button_stop:
                stopMusic();
                break;

        }


    }


    public void startMusic()
    {

//        if (myPlayer.isPlaying()) {
            //        stopMusic(); //前の曲が再生中なら一旦止めたい
//        }
//        else
//        {
            myPlayer.start();
//        }
    }

    public void pauseMusic()
    {
        if (myPlayer.isPlaying())
        {
            myPlayer.pause();
        }
    }

    public void stopMusic()
    {
        if (myPlayer.isPlaying())
        {
            myPlayer.stop();
            setMusic(spinner.getSelectedItemPosition());
        }
    }

    public void setMusic(int i)
    {
        //音楽リソースをMediaPlayerにセット
        myPlayer=MediaPlayer.create(getApplicationContext(), files.getFileID(i));

        textView.setText(String.valueOf(myPlayer.getDuration()/1000) + "秒"); //曲の長さを取得して表示
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        myPlayer.release(); //アプリケーション終了時に解放
    }



    public class Files //別ファイルかは厳しいかも、ということでインナークラスに
     {

        private List<Integer> files = new ArrayList<Integer>();

        public Files()
        {
            files.add(R.raw.music1);
            files.add(R.raw.music2);
            files.add(R.raw.music3);
            files.add(R.raw.music4);
            files.add(R.raw.music5);
        }

        public int getFileID(int i)
        {
            return this.files.get(i);
        }

        public String getFileName(int i)
        {
            String filename = getResources().getResourceName(getFileID(i));

            return removeExtension(removePath(filename));
//        return filename;

        }

        public int getSize()
        {
            return files.size();
        }

        //"https://www.techiedelight.com/ja/get-filename-without-extension-in-java/"より
        public String removeExtension(String fileName) {
            int lastIndex = fileName.lastIndexOf('.');
            if (lastIndex != -1) {
                fileName = fileName.substring(0, lastIndex);
            }
            return fileName;
        }

        public String removePath(String fileName)
        {
            int lastIndex = fileName.lastIndexOf('/');
            if (lastIndex != -1) {
                fileName = fileName.substring(lastIndex+1);
            }

            return fileName;
        }

    }




}