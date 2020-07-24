package com.example.noscreengrab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // INFLATE ACTIVITY LAYOUT
        setContentView(R.layout.activity_main);
        // THIS FLAG TREATS THE CONTENTS OF THE ACTIVITY LAYOUT AS SECURE AND PREVENTS TAKING SCREENSHOTS
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    }
}