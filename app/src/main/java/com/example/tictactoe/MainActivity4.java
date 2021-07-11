package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        setContentView(R.layout.activity_main4);
    }
    public  void one(View view){
        Intent intent=new Intent(MainActivity4.this,MainActivity.class);
        startActivity(intent);
    }
    public  void two(View view){
        Intent intent=new Intent(MainActivity4.this,MainActivity3.class);
        startActivity(intent);
    }
}