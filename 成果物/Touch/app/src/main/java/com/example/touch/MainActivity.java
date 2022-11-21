package com.example.touch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;
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

        TextView point_x = (TextView) findViewById(R.id.textView3);
        TextView point_y = (TextView) findViewById(R.id.textView4);

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), R.string.touchMessage, Toast.LENGTH_SHORT).show();
                break;
                case MotionEvent.ACTION_MOVE:
                    point_x.setText(String.valueOf(event.getX()));
                    point_y.setText(String.valueOf(event.getY()));
                    break;
            case MotionEvent.ACTION_UP:
                point_x.setText("");
                point_y.setText("");
                break;

        }

        return true; //trueを指定すると、このイベントをスーパークラスに伝搬しない

    }

}