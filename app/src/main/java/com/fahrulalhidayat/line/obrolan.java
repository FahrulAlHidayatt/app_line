package com.fahrulalhidayat.line;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class obrolan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrolan);
    }
    public void clickTeman(View view) {
        Intent intent = new Intent(obrolan.this, teman.class);
        startActivity(intent);
    }
}
