package com.fahrulalhidayat.line;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mulai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

    }
    public void clickMulai(View view) {
        Intent intent = new Intent(mulai.this, login.class);
        startActivity(intent);
    }
}
