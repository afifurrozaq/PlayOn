package com.androidtutorialpoint.googlemapsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String a = getIntent().getStringExtra("streetNumber");
        Toast.makeText(this,a, Toast.LENGTH_LONG).show();
    }
}
