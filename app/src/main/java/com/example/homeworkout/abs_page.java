package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class abs_page extends AppCompatActivity {

    LinearLayout ll_jumping_jack_beginner;
    LinearLayout ll_abdominal_crunches_beginner;
    LinearLayout ll_russian_twist_beginner;
    LinearLayout ll_mountain_climber_beginner, ll_hell_touch_beginner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_page);

        ll_jumping_jack_beginner = findViewById(R.id.ll_jumping_jack_beginner);
        ll_abdominal_crunches_beginner = findViewById(R.id.ll_abdominal_crunches_beginner);
        ll_russian_twist_beginner = findViewById(R.id.ll_russian_twist_beginner);
        ll_mountain_climber_beginner = findViewById(R.id.ll_mountain_climber_beginner);
        ll_hell_touch_beginner = findViewById(R.id.ll_hell_touch_beginner);

        ll_jumping_jack_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_page.this, jumping_jack_beginner.class);
                startActivity(intent);
            }
        });

        ll_abdominal_crunches_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_page.this, abdominal_crunches.class);
                startActivity(intent);
            }
        });
        ll_russian_twist_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_page.this, russian_twist.class);
                startActivity(intent);
            }
        });

        ll_mountain_climber_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_page.this, mountain_climber.class);
                startActivity(intent);
            }
        });

        ll_hell_touch_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_page.this, touch_hell.class);
                startActivity(intent);
            }
        });


    }
}