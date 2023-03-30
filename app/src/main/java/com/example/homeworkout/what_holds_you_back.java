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

import org.w3c.dom.Text;
//6th page
public class what_holds_you_back extends AppCompatActivity {

    TextView what_holds_you_back , if_we_know;
    CheckBox busy_schedule , not_enough_confidence, missing_support_from_other, not_enough_motivation , u_are_shy;
    Button btn_continue_ur_challenges;
    Animation top_animation , bottom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_holds_you_back);

        what_holds_you_back = findViewById(R.id.what_holds_you_back);
        if_we_know = findViewById(R.id.if_we_know);
        busy_schedule = findViewById(R.id.busy_schedule);
        not_enough_confidence = findViewById(R.id.not_enough_confidence);
        missing_support_from_other = findViewById(R.id.missing_support_from_other);
        not_enough_motivation = findViewById(R.id.not_enough_motivation);
        u_are_shy = findViewById(R.id.u_are_shy);

        btn_continue_ur_challenges = findViewById(R.id.btn_continue_ur_challenges);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        what_holds_you_back.setAnimation(top_animation);
        if_we_know.setAnimation(top_animation);
        busy_schedule.setAnimation(top_animation);
        not_enough_confidence.setAnimation(top_animation);
        missing_support_from_other.setAnimation(bottom_animation);
        not_enough_confidence.setAnimation(bottom_animation);
        u_are_shy.setAnimation(bottom_animation);
        btn_continue_ur_challenges.setAnimation(bottom_animation);




        btn_continue_ur_challenges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.homeworkout.what_holds_you_back.this, thanks_page.class);
                startActivity(intent);
                finish();
            }
        });



    }
}