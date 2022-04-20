package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button_1 = findViewById(R.id.hide_my_name);
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                TextView textView = (TextView) findViewById(R.id.name);
                textView.setVisibility(View.INVISIBLE);
            }
        });
        final Button button_2 = findViewById(R.id.show_my_name);
        button_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                TextView textView = (TextView) findViewById(R.id.name);
                textView.setVisibility(View.VISIBLE);
            }
        });
    }
}