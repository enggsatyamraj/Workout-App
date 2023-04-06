package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class discoverPage extends AppCompatActivity {
    TextView linear_discover_training;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_page);


        linear_discover_training = (TextView) findViewById(R.id.linear_discover_training);
        linear_discover_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(discoverPage.this, Home_page.class);
                startActivity(intent);
            }
        });

    }
}