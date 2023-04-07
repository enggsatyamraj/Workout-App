package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class mountain_climber extends AppCompatActivity {

    Button start_timer_mountain_climber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_climber);

        start_timer_mountain_climber = findViewById(R.id.start_timer_mountain_climber);
        start_timer_mountain_climber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(60000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        // Update the UI with the remaining time
                        long seconds = millisUntilFinished / 1000;
                        start_timer_mountain_climber.setText("Remaining Time: " + seconds);
                    }

                    public void onFinish() {
                        // Update the UI when the timer finishes
                        start_timer_mountain_climber.setText("Timer finished!");
                    }

                }.start();
            }
        });
    }
}