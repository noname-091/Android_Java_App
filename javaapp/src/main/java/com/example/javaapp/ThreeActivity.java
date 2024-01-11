package com.example.javaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Button last_act = findViewById(R.id.btn_last_act);

        last_act.setOnClickListener(v -> {
            Intent oyna_2 = new Intent(getApplicationContext(), SeconActivity.class);
            startActivity(oyna_2);
        });
        meva();


    }

    public void meva(){
        Button natija = findViewById(R.id.natija_1);
        RadioGroup group_meva = findViewById(R.id.mevalar);

        natija.setOnClickListener(v -> {
            int javob = group_meva.getCheckedRadioButtonId();
            RadioButton javob_meva = findViewById(javob);
            if (javob_meva == null){
               Toast.makeText(ThreeActivity.this, "Mevalardan birini tanlashingiz kerak", Toast.LENGTH_SHORT).show();
            }
            else {
            Toast.makeText(ThreeActivity.this, javob_meva.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
