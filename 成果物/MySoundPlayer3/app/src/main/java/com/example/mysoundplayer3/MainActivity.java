package com.example.mysoundplayer3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myPlayer;

    TextView textView_artist; //アーチストの名前

    TextView textView_name; //曲名

    TextView textView_length; //音楽の長さ

    Files files = new Files();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_artist = findViewById(R.id.textView_artist);

        textView_name = findViewById(R.id.textView_name);

        textView_length = findViewById(R.id.textView_length);

    }



    public void startMusic()
    {
//        stopMusic(); //前の曲が再生中なら一旦止めたい
        myPlayer.start();
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
//            setMusic(spinner.getSelectedItemPosition());
        }
    }

    public void setMusic(int i)
    {
        //音楽リソースをMediaPlayerにセット
        myPlayer= MediaPlayer.create(getApplicationContext(), files.getFileID(i));

        textView_length.setText(String.valueOf(myPlayer.getDuration()/1000) + "秒"); //曲の長さを取得して表示
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        myPlayer.release(); //アプリケーション終了時に解放
    }




    //インナークラス"Files"はじまり
    //MySoundPlayer2からコピペして改修
    public class Files //別ファイルかは厳しいかも、ということでインナークラスに
    {

        private List<Integer> files = new ArrayList<Integer>();
        private List<Integer> covers = new ArrayList<Integer>();

        public Files()
        {
            files.add(R.raw.music1);
            covers.add(R.drawable.japan_character3_kantou1__ibaraki);

            files.add(R.raw.music2);
            covers.add(R.drawable.school_man);

            files.add(R.raw.music3);
            covers.add(R.drawable.music_band_visual);

            files.add(R.raw.music4);
            covers.add(R.drawable.music_black_metal_band_corps_paint);

            files.add(R.raw.music5);
            covers.add(R.drawable.school_woman);


        }

        public int getFileID(int i)
        {
            return this.files.get(i);
        }

        public int getCoverID(int i)
        {
            return this.covers.get(i);
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

    }//インナークラス"Files"おわり

}