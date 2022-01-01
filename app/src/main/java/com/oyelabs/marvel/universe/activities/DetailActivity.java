package com.oyelabs.marvel.universe.activities;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.oyelabs.marvel.universe.R;
import com.oyelabs.marvel.universe.utils.NetworkChangeListener;

public class DetailActivity extends AppCompatActivity {
    private ImageView characterImage;
    private TextView characterName, characterDetail;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }

    private void initViews() {
        characterImage = findViewById(R.id.characterImage);
        characterName = findViewById(R.id.characterName);
        characterDetail = findViewById(R.id.characterDetails);
    }

    public void backToMain(View view) {
        startActivity(new Intent(DetailActivity.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onStart() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeListener, filter);
        super.onStart();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeListener);
        super.onStop();
    }
}