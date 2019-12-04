package com.example.activitylisecycletest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityConllector.removeActivity(this);
    }
}
