package com.example.mydroid1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {

//        //検証用
//        Toast.makeText(getApplicationContext(), String.valueOf(v.getId()), Toast.LENGTH_SHORT).show();

        String btn_name = "";

        switch(v.getId())
        {
//            case "@+id/button1":
//            case 2131230819:
            case R.id.button1: //"https://android.keicode.com/basics/ui-click-listener.php"より
//                btn_name="ボタン１";
                btn_name=getString(R.string.btn_title1); //"http://9ensan.com/blog/smartphone/android/android-strings-xml-getstring/"
                break;
            case R.id.button2:
//                btn_name="ボタン２";
                btn_name=getString(R.string.btn_title2);
                break;
        }

        Toast.makeText(getApplicationContext(), btn_name+"が押されました", Toast.LENGTH_SHORT).show();
    }
}