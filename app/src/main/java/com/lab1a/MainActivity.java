package com.lab1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lab1a.activity.MainActivityInflater;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityInflater.inflate(this);

    }

}
