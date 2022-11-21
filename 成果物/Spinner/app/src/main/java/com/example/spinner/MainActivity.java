package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //"http://androidguide.nomaki.jp/html/widget/spinner/getitem.html"より
        // Spinnerオブジェクトを取得
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
//
//        // 選択されているアイテムのIndexを取得
//        int idx = spinner.getSelectedItemPosition();
//
//        // 選択されているアイテムを取得
//        String item = (String)spinner.getSelectedItem();

//        //"https://woodsmall.co.jp/android/spinner-onitemselected/"より
//        // 初回動作の対応
//        spinner.setFocusable(false);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

//        //"https://woodsmall.co.jp/android/spinner-onitemselected/"より
//        // 初回の動作
//        if (adapterView.isFocusable() == false) {
//            adapterView.setFocusable(true);
//            return;
//        }
//        // 初回以降の動作

        if(adapterView.getSelectedItemPosition() != 0) {

            Toast.makeText(MainActivity.this,
                    adapterView.getSelectedItem().toString()
                            + "が選択されました",
                    Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        //このメソッド内には何も記述しない
    }
}