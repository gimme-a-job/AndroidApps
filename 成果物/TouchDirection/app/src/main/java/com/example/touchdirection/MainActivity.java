package com.example.touchdirection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    float px_start = 0;
    float px_end = 0;
    float py_start;
    float py_end;

    //"https://programming-cafe.com/programming/android-info/get-used-language-of-smartphone/"より
    Locale locale;
    String language;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event)
    {

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
//                Toast.makeText(getApplicationContext(), R.string.touchMessage, Toast.LENGTH_SHORT).show();
                //X
                px_start = event.getX();
                px_end = 0; //念のため
                //Y
                py_start = event.getY();
                py_end = 0; //念のため
                break;
            case MotionEvent.ACTION_MOVE:
                //こっちじゃなかった
//                px_start = event.getX();
//                px_flg = true;
//                px_end = 0; //念のため
                break;
            case MotionEvent.ACTION_UP:
                px_end = event.getX();
                py_end = event.getY();

                StringBuilder sb_start = new StringBuilder();
                StringBuilder sb_end = new StringBuilder();

                String U = getString(R.string.dir_Up); //上
                String L = getString(R.string.dir_Left); //左
                String D = getString(R.string.dir_Down); //下
                String Right = getString(R.string.dir_Right); //右

                //"https://programming-cafe.com/programming/android-info/get-used-language-of-smartphone/"より
                locale = Locale.getDefault();
                language = locale.getLanguage();

                float px_diff = px_end - px_start;
                float py_diff = py_end - py_start;

                if(locale.equals(Locale.JAPAN)||locale.equals(Locale.JAPANESE)){
                    Log.d("Log0","ようこそ! 使用言語は"+language+"です");
                    //日本向け処理

                    //X
                    if(px_diff > 0)
                    {
//                    Toast.makeText(getApplicationContext(), "左⇒右", Toast.LENGTH_SHORT).show();
//                    sb_start.append("左");
//                    sb_end.append("右");
                        sb_start.append(L);
                        sb_end.append(Right);

                    }
                    else if(px_diff < 0)
                    {
//                    Toast.makeText(getApplicationContext(), "右⇒左", Toast.LENGTH_SHORT).show();
//                    sb_start.append("右");
//                    sb_end.append("左");
                        sb_start.append(Right);
                        sb_end.append(L);
                    }

                    //Y
                    if(py_diff > 0)
                    {
//                    Toast.makeText(getApplicationContext(), "上⇒下", Toast.LENGTH_SHORT).show();
//                    sb_start.append("上");
//                    sb_end.append("下");
                        sb_start.append(U);
                        sb_end.append(D);
                    }
                    else if(py_diff < 0)
                    {
//                    Toast.makeText(getApplicationContext(), "下⇒上", Toast.LENGTH_SHORT).show();
//                    sb_start.append("下");
//                    sb_end.append("上");
                        sb_start.append(D);
                        sb_end.append(U);
                    }

                }else{
                    Log.d("Log0","Welcome! The language used is "+language);
                    //デフォルトの処理

                    //Y
                    if(py_diff > 0)
                    {
//                    Toast.makeText(getApplicationContext(), "上⇒下", Toast.LENGTH_SHORT).show();
//                    sb_start.append("上");
//                    sb_end.append("下");
                        sb_start.append(U);
                        sb_end.append(D);
                    }
                    else if(py_diff < 0)
                    {
//                    Toast.makeText(getApplicationContext(), "下⇒上", Toast.LENGTH_SHORT).show();
//                    sb_start.append("下");
//                    sb_end.append("上");
                        sb_start.append(D);
                        sb_end.append(U);
                    }

                    sb_start.append(" ");
                    sb_end.append(" ");

                    //X
                    if(px_diff > 0)
                    {
//                    Toast.makeText(getApplicationContext(), "左⇒右", Toast.LENGTH_SHORT).show();
//                    sb_start.append("左");
//                    sb_end.append("右");
                        sb_start.append(L);
                        sb_end.append(Right);

                    }
                    else if(px_diff < 0)
                    {
//                    Toast.makeText(getApplicationContext(), "右⇒左", Toast.LENGTH_SHORT).show();
//                    sb_start.append("右");
//                    sb_end.append("左");
                        sb_start.append(Right);
                        sb_end.append(L);
                    }


                }

                Toast.makeText(getApplicationContext(), sb_start.toString() + " ⇒ " + sb_end.toString(), Toast.LENGTH_SHORT).show();

                break;

        }

        return true; //trueを指定すると、このイベントをスーパークラスに伝搬しない

    }


}