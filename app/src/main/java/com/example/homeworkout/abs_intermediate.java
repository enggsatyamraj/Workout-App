package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class abs_intermediate extends AppCompatActivity {
    LinearLayout ll_v_up_intermediate, ll_cross_over_crunch_intermediate, ll_side_bridge_left, ll_side_bridge_right,ll_bicycle_crunches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_intermediate);
        ll_v_up_intermediate = findViewById(R.id.ll_v_up_intermediate);
        ll_cross_over_crunch_intermediate = findViewById(R.id.ll_cross_over_crunch_intermediate);
        ll_side_bridge_left = findViewById(R.id.ll_side_bridge_left);
        ll_side_bridge_right = findViewById(R.id.ll_side_bridge_right);
        ll_bicycle_crunches = findViewById(R.id.ll_bicycle_crunches);

        ll_v_up_intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_intermediate.this, v_up_intermediate.class);
                startActivity(intent);
            }
        });

        ll_cross_over_crunch_intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_intermediate.this, crossover_cruch_intermediate.class);
                startActivity(intent);
            }
        });
        ll_side_bridge_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_intermediate.this, side_bridge_intermediate.class);
                startActivity(intent);
            }
        });
        ll_side_bridge_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_intermediate.this, side_bridge_right_intermediate.class);
                startActivity(intent);
            }
        });
        ll_bicycle_crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abs_intermediate.this, bicycle_crunches_intermediate.class);
                startActivity(intent);
            }
        });

    }
}