package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
//5th page
public class how_much_active_you_are extends AppCompatActivity {

    TextView how_active , this_helps;

    RadioButton not_at_all , slightly_active , active , very_active;

    Button btn_continue;
    Animation top_animation , bottom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_much_active_you_are);


        how_active = findViewById(R.id.how_active);
        this_helps = findViewById(R.id.this_helps);
        not_at_all = findViewById(R.id.not_at_all);
        slightly_active = findViewById(R.id.slightly_active);
        active = findViewById(R.id.active);
        very_active = findViewById(R.id.very_active);
        btn_continue = findViewById(R.id.btn_continue);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        how_active.setAnimation(top_animation);
        this_helps.setAnimation(top_animation);

        not_at_all.setAnimation(top_animation);
        slightly_active.setAnimation(top_animation);
        active.setAnimation(bottom_animation);
        very_active.setAnimation(bottom_animation);
        btn_continue.setAnimation(bottom_animation);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(how_much_active_you_are.this , what_holds_you_back.class);
                startActivity(intent);
            }
        });


    }
}