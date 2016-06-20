package com.example.jamesg.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Girl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl);
    }

    public void work(View view) {
        Intent intent = new Intent(getApplicationContext(), Girlwork.class);
        startActivity(intent);
    }
    public void casual(View view) {
        Intent intent = new Intent(getApplicationContext(), Girlgala.class);
        startActivity(intent);
    }
    public void gala(View view) {
        Intent intent = new Intent(getApplicationContext(), Girlgala.class);
        startActivity(intent);
    }
}

