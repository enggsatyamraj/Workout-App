package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.awt.font.TextAttribute;
//4th page
public class whatIsYourGoal extends AppCompatActivity {

    TextView fitness_goal , desc;

    CheckBox build_muscle , stay_healthy , get_fit , lose_weight;

    Button btn_continue;

    Animation top_animation , bottom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_your_goal);

        fitness_goal = findViewById(R.id.fitness_goal);
        desc = findViewById(R.id.desc);
        build_muscle = findViewById(R.id.build_muscle);
        stay_healthy = findViewById(R.id.stay_healthy);
        get_fit = findViewById(R.id.get_fit);
        lose_weight = findViewById(R.id.lose_weight);
        btn_continue = findViewById(R.id.btn_continue);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        fitness_goal.setAnimation(top_animation);
        desc.setAnimation(top_animation);
        build_muscle.setAnimation(bottom_animation);
        stay_healthy.setAnimation(bottom_animation);
        get_fit.setAnimation(bottom_animation);
        lose_weight.setAnimation(bottom_animation);
        btn_continue.setAnimation(bottom_animation);



        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(whatIsYourGoal.this , how_much_active_you_are.class);
                startActivity(intent);
            }
        });


    }
}