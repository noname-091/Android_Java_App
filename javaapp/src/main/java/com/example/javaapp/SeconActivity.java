package com.example.javaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class SeconActivity extends AppCompatActivity {

    public Button btn1;
    public CheckBox chek1, chek2, chek3;
    public ToggleButton btntg;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn_last = findViewById(R.id.btn_last_act);

        btn_last.setOnClickListener(v -> {
            Intent bosh_oyna = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(bosh_oyna);
        });

        Button btn_next = findViewById(R.id.btn_next_act);

        btn_next.setOnClickListener(v -> {
            Intent keyingi_oyna = new Intent(getApplicationContext(), ThreeActivity.class);
            startActivity(keyingi_oyna);
        });

        btntg = findViewById(R.id.btntg);

        btntg.setOnClickListener(v -> {
            String btnshow = (String) btntg.getText();

            if (Objects.equals(btnshow, "off")){
                btn1.setVisibility(View.INVISIBLE);
            }
            else {
                btn1.setVisibility(View.VISIBLE);
            }
            Toast.makeText(SeconActivity.this, btntg.getText().toString(), Toast.LENGTH_SHORT).show();
        });

        btn1 = findViewById(R.id.narx);

        btn1.setOnClickListener(v -> {
            bozorlik();
        });
    }

    public void bozorlik(){
        chek1 = findViewById(R.id.checkBox1);
        chek2 = findViewById(R.id.checkBox2);
        chek3 = findViewById(R.id.checkBox3);

        StringBuilder natija = new StringBuilder();
        natija.append("\n Tanlanagan maxsulotlar: ");

        int summ = 0;

        if (chek1.isChecked()){
            natija.append(", ");
            natija.append(chek1.getText().toString());
            summ += 15000;
        }
        if (chek2.isChecked()){
            natija.append(", ");
            natija.append(chek2.getText().toString());
            summ += 10000;

        }
        if (chek3.isChecked()){
            natija.append(", ");
            natija.append(chek3.getText().toString());
            summ += 25000;
        }

        Toast.makeText(SeconActivity.this, natija + " \nUmumiy narx: "+summ+" sum", Toast.LENGTH_SHORT).show();

    }
}
