package com.android.example.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        int raspberryPrice = 5;
        t = (TextView) findViewById(R.id.display_text_view);
        display1("1 box: $" + raspberryPrice);
        raspberryPrice = 10;
        t = (TextView) findViewById(R.id.display_text_view_2);
        display2("2 boxes: $" + (raspberryPrice));
        t = (TextView) findViewById(R.id.display_text_view_3);
        display3("3 boxes: $" + (raspberryPrice * 3));

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
       // TextView t = (TextView) findViewById(R.id.display_text_view); создал глобальную переменную и вывел поиск id в метод onCreate
        t.setText(text);
    }

    public void display(int text) {
       // TextView t = (TextView) findViewById(R.id.display_text_view); создал глобальную переменную и вывел поиск id в метод onCreate
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }

    public void display2(String text) {
        //TextView t = (TextView) findViewById(R.id.display_text_view_2); создал глобальную переменную и вывел поиск id в метод onCreate
        t.setText(text);
    }

    public void display3(String text) {
        //TextView t = (TextView) findViewById(R.id.display_text_view_3); создал глобальную переменную и вывел поиск id в метод onCreate
        t.setText(text);
    }
}