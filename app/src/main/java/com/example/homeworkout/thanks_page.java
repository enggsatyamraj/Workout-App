package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class thanks_page extends AppCompatActivity {
    private static int SPLASH_SCREEEN=3000;

    TextView thanks , please_wait;
    ImageView check_mark;
    Animation top_animation , bottom_animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_thanks_page);

        thanks = findViewById(R.id.thanks);
        please_wait = findViewById(R.id.please_wait);
        check_mark = findViewById(R.id.check_mark);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        thanks.setAnimation(top_animation);
        please_wait.setAnimation(bottom_animation);
        check_mark.setAnimation(bottom_animation);


    }
}