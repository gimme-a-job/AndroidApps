package com.example.mydroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttonのリソース情報の取得
        Button dispBtn = findViewById(R.id.button);
        //Buttonにイベントリスナーを登録(インナークラスの指定)
        dispBtn.setOnClickListener(new ButtonClickListener());

    }

    private class ButtonClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            //リソース情報の取得
            TextView outMsg=findViewById(R.id.textView);
            EditText inMsg=findViewById(R.id.editText);
            //メッセージの表示
            outMsg.setText(inMsg.getText());
        }

    }

}