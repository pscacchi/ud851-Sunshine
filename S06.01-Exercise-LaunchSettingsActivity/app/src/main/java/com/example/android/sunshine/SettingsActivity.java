package com.example.android.sunshine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

// TODO (1) Add new Activity called SettingsActivity using Android Studio wizard
// Do step 2 in SettingsActivity
// TODO (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar


public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
