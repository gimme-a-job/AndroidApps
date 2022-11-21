package com.example.calc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radio = (RadioGroup) findViewById(R.id.radioGroup);
//        radio.setOnCheckedChangeListener(this);
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                EditText num1 = (EditText) findViewById(R.id.editText1);
                EditText num2 = (EditText) findViewById(R.id.editText2);
                TextView answer = (TextView) findViewById(R.id.textView4);

                int a = 0;
                int b = 0;
                int c = 0;

                try {
                    a = Integer.parseInt(num1.getText().toString());
                    b = Integer.parseInt(num2.getText().toString());
                }
                catch (Exception e)
                {
                    //            Toast.makeText(MainActivity.this,
//                    e.toString(),
//                    Toast.LENGTH_SHORT).show();

                    answer.setText(String.valueOf(e));
                    Toast.makeText(MainActivity.this,
                            "入力できるデータは正/負の整数のみ！",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

//                //検証用
//                Toast.makeText(MainActivity.this,
//                        String.valueOf(i),
//                        Toast.LENGTH_SHORT).show();

                switch (i)
                {
                    case R.id.radioButton1: //和
                        c= a+b;
                        break;
                    case R.id.radioButton2: //差
                        c=a-b;
                        break;
                    case R.id.radioButton3: //積
                        c=a*b;
                        break;
                    case R.id.radioButton4: //商
                        c=a/b;
                        break;
                }

                answer.setText(String.valueOf(c));

            }
        });
    }
}