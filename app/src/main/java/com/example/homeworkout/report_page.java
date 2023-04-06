package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class report_page extends AppCompatActivity {

    BottomNavigationView bottom_navigation_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_page);

        bottom_navigation_view = findViewById(R.id.bottom_navigation_view);
    }
}