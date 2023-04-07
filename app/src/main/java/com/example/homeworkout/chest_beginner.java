package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chest_beginner extends AppCompatActivity {

    LinearLayout ll_jumping_jack_beginners, ll_incline_pushups_beginner, ll_pushups_beginner, ll_wide_arms_pushups_beginner, ll_triceps_dips_beginner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_beginner);

        ll_jumping_jack_beginners = findViewById(R.id.ll_jumping_jack_beginners);
        ll_incline_pushups_beginner = findViewById(R.id.ll_incline_pushups_beginner);
        ll_pushups_beginner = findViewById(R.id.ll_pushups_beginner);
        ll_wide_arms_pushups_beginner = findViewById(R.id.ll_wide_arms_pushups_beginner);
        ll_triceps_dips_beginner = findViewById(R.id.ll_triceps_dips_beginner);



        ll_jumping_jack_beginners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_beginner.this, jumping_jack_beginner.class);
                startActivity(intent);
            }
        });

        ll_incline_pushups_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_beginner.this, incline_pushups_beginner.class);
                startActivity(intent);
            }
        });
        ll_pushups_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_beginner.this, pushups_beginner.class);
                startActivity(intent);
            }
        });

        ll_wide_arms_pushups_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_beginner.this, widearm_pushups_beginner.class);
                startActivity(intent);
            }
        });
        ll_triceps_dips_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chest_beginner.this, triceps_dips_beginner.class);
                startActivity(intent);
            }
        });
    }
}