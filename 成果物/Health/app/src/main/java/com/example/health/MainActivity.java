package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        EditText input_height = (EditText) findViewById(R.id.editTextText1);
        EditText input_weight = (EditText) findViewById(R.id.editTextText2);

        double height = 0;
        double weight = 0;

        if(input_height.getText().toString().equals("") || input_weight.getText().toString().equals(""))
        {

        }
        else
        {

        try {
            height = Double.parseDouble(input_height.getText().toString()) / 100; //(m)に変換
            weight = Double.parseDouble(input_weight.getText().toString());
        }
        catch (Exception e)
        {
//            Toast.makeText(MainActivity.this,
//                    "入力できるデータは正/負の整数のみ！",
//                    Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this,
                    e.toString(),
                    Toast.LENGTH_SHORT).show();
            return;
        }



        } //if終わり

        TextView weight_present = (TextView) findViewById(R.id.textView7);
        weight_present.setText(String.valueOf(weight));

        TextView weight_standard = (TextView) findViewById(R.id.textView8);
        //最小桁数が６文字、小数点以下が１桁に変換
        weight_standard.setText(String.format("%6.1f",(height*height)*22));
//        weight_standard.setText(String.valueOf((height*height)*22));

        TextView bmi = (TextView) findViewById(R.id.textView9);
        //最小桁数が６文字、小数点以下が１桁に変換
        bmi.setText(String.format("%6.1f",(weight/(height*height))));
//        bmi.setText(String.valueOf(weight/(height*height)));

    }
}