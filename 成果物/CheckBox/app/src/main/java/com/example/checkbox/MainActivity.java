package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

//        CheckBox[] chks = new CheckBox[5];
//
//        chks[0] = findViewById(R.id.checkBox1);
//        chks[1] = findViewById(R.id.checkBox2);
//        chks[2] = findViewById(R.id.checkBox3);
//        chks[3] = findViewById(R.id.checkBox4);
//        chks[4] = findViewById(R.id.checkBox5);

        List<CheckBox> chks = new ArrayList<CheckBox>();

        chks.add(findViewById(R.id.checkBox1));
        chks.add(findViewById(R.id.checkBox2));
        chks.add(findViewById(R.id.checkBox3));
        chks.add(findViewById(R.id.checkBox4));
        chks.add(findViewById(R.id.checkBox5));

        StringBuilder sb = new StringBuilder();

        int count = 0;


        for(int i=0; i<chks.size();i++)
        {


            if(chks.get(i).isChecked())
            {
                if(count!=0)
                {
                    sb.append(" ");
                }

                sb.append(chks.get(i).getText());
                count++;
            }
        }

        Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();

    }
}