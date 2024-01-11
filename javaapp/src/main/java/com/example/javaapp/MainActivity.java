package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btn1;
    private Button btn2, btnweb;
    private Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnweb = findViewById(R.id.btn_web);
        TextView natija = findViewById(R.id.natija);
        EditText maTn = findViewById(R.id.etv);
        Button next_act = findViewById(R.id.btn_next_act);

        switch1 = findViewById(R.id.switch1);
        switch1.setOnClickListener(v -> {
            if (!switch1.isChecked()){
                natija.setVisibility(View.INVISIBLE);
            }
            else {
                natija.setVisibility(View.VISIBLE);
            }
        });

        btnweb.setOnClickListener(v -> {
            Intent webIntent = new Intent(getApplicationContext(), web_activity.class);
            startActivity(webIntent);
        });


        maTn.setOnClickListener(v-> tv.setText(maTn.getText()));

        next_act.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SeconActivity.class);
            startActivity(intent);

        });


        btn1.setOnClickListener(view -> {
         if (btn1.isPressed()){
             tv.setVisibility(View.VISIBLE);
             Toast.makeText(getApplicationContext(), "Matn ko'rsatildi", Toast.LENGTH_SHORT).show();
             natija.setText(String.valueOf(tv.getVisibility()));
         }
        });

        btn2.setOnClickListener(v -> {
            if(btn2.isPressed()){
                tv.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(), "Matn berkitildi", Toast.LENGTH_SHORT).show();
                natija.setText(String.valueOf(tv.getVisibility()));

            }
        });

    }
}