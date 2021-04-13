package com.fahrulalhidayat.line;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class teman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teman);
    }

    public void clickChat(View view) {
        Intent intent = new Intent(teman.this, obrolan.class);
        startActivity(intent);
    }
}
