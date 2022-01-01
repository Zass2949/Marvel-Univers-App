package com.oyelabs.marvel.universe.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;
import com.oyelabs.marvel.universe.R;

public class SplashActivity extends AppCompatActivity {
    private CircularFillableLoaders circularFillableLoaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        circularFillableLoaders = findViewById(R.id.circular_fillable_loaders);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        },3000);
    }
}