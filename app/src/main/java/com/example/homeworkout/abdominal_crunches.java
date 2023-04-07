package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class abdominal_crunches extends AppCompatActivity {

    Button start_timer_abdominal_beginner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdominal_crunches);

        start_timer_abdominal_beginner = findViewById(R.id.start_timer_abdominal_beginner);
        start_timer_abdominal_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(60000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        // Update the UI with the remaining time
                        long seconds = millisUntilFinished / 1000;
                        start_timer_abdominal_beginner.setText("Remaining Time: " + seconds);
                    }

                    public void onFinish() {
                        // Update the UI when the timer finishes
                        start_timer_abdominal_beginner.setText("Timer finished!");
                    }

                }.start();
            }
        });
    }
}