package com.deka.ceritapendek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lutung(View view) {
        Intent intent = new Intent (this,lutung.class);
        startActivity(intent);
    }

    public void kundang(View view) {
        Intent intent = new Intent(this, kundang.class);
        startActivity(intent);
    }
}
