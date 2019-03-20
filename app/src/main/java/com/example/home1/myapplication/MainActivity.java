package com.example.home1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("MainActivityLife","using onCreate()");
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MainActivityLife","using onReStart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivityLife","using onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivityLife","using onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivityLife","using onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivityLife","using onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivityLife","using onDestroy()");
    }
}