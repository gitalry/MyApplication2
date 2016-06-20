package com.example.jamesg.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Manoption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manoption);
    }
    public void work1(View view) {
        Intent intent = new Intent(getApplicationContext(), Manwork.class);
        startActivity(intent);
    }
    public void casual1(View view) {
        Intent intent = new Intent(getApplicationContext(), Manout.class);
        startActivity(intent);
    }
    public void gala1(View view) {
        Intent intent = new Intent(getApplicationContext(), Mangala.class);
        startActivity(intent);
    }
}
