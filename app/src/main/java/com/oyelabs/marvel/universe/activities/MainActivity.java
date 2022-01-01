package com.oyelabs.marvel.universe.activities;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.oyelabs.marvel.universe.R;
import com.oyelabs.marvel.universe.utils.NetworkChangeListener;
import com.oyelabs.marvel.universe.viewholder.ViewHolder;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private CircleImageView circleImageView;
    private TextView displayName;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        //To Search Characters
        findViewById(R.id.fabSearch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchView();
            }
        });
        //ViewHolder To hold
        ViewHolder viewHolder = null;
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To View Detail Activity Of Character
            }
        });
    }

    private void initViews() {
        circleImageView = findViewById(R.id.characterImage);
        displayName = findViewById(R.id.charactersName);
    }

    private void openSearchView() {

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