package com.example.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        float sumofDays = day1+day2+day3;
        display(sumofDays / 3);
    }

    private void display(float i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText("" + i);
    }

}
