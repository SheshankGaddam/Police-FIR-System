package com.example.precious_lord.aedc_cms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setTitle(R.string.title_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
