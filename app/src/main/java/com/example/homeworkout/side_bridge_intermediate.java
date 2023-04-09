package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class side_bridge_intermediate extends AppCompatActivity {
    Button start_timer_incline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_bridge_intermediate);

        start_timer_incline = findViewById(R.id.start_timer_incline_pushups);

        start_timer_incline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(60000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        // Update the UI with the remaining time
                        long seconds = millisUntilFinished / 1000;
                        start_timer_incline.setText("Remaining Time: " + seconds);
                    }

                    public void onFinish() {
                        // Update the UI when the timer finishes
                        start_timer_incline.setText("Timer finished!");
                    }

                }.start();
            }
        });
    }
}