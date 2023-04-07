package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class triceps_dips_beginner extends AppCompatActivity {

    Button start_timer_incline_pushups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_dips_beginner);

        start_timer_incline_pushups = findViewById(R.id.start_timer_incline_pushups);
        start_timer_incline_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(60000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        // Update the UI with the remaining time
                        long seconds = millisUntilFinished / 1000;
                        start_timer_incline_pushups.setText("Remaining Time: " + seconds);
                    }

                    public void onFinish() {
                        // Update the UI when the timer finishes
                        start_timer_incline_pushups.setText("Timer finished!");
                    }

                }.start();
            }
        });
    }
}