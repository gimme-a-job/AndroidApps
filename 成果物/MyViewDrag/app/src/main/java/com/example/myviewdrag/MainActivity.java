package com.example.myviewdrag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    MyView myCustomView; //描画用オブジェクトの生成

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); //(コメントアウトすることで)デフォルトのGUI画面は表示させない
//        MyView myCustomView = new MyView(this); //描画用オブジェクトの生成
        myCustomView = new MyView(this); //描画用オブジェクトの生成
        setContentView(myCustomView); //Activity上に描画する
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //タッチ位置に再描画
//                myCustomView.setXY(event.getX(), event.getY());
//                myCustomView.invalidate();
//                break;

            case MotionEvent.ACTION_MOVE:
                //動いた位置に再描画
                myCustomView.setXY(event.getX(), event.getY());
                myCustomView.invalidate();
                break;

            case MotionEvent.ACTION_UP:
                //何もしない
                break;


        }//switch文終わり

        return true;

    }//"onTouchEvent"終わり

}//クラス終わり