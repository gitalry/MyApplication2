package com.example.jamesg.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void girl(View view) {
        Intent intent = new Intent(getApplicationContext(), Girl.class);
        startActivity(intent);
    }

    public void guy(View view) {
        Intent intent = new Intent(getApplicationContext(), Manoption.class);
        startActivity(intent);
    }
}
