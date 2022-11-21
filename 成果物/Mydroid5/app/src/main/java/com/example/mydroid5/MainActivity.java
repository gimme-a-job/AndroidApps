package com.example.mydroid5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if (event.getAction()==MotionEvent.ACTION_DOWN)
        {
            Toast.makeText(getApplicationContext(), R.string.touchMessage, Toast.LENGTH_SHORT).show();
        }


        return true; //trueを指定すると、このイベントをスーパークラスに伝搬しない

    }


}