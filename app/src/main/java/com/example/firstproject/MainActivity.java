package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button btnSeePlan, btnActivities, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();
    }

    private void initViews() {
        Log.d(TAG, "initViews: started");
        btnSeePlan = findViewById(R.id.btnAllActivities);
        btnActivities = findViewById(R.id.btnAllActivities);
        btnAbout = findViewById(R.id.btnAbout);




    }
}