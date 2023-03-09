package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
//1st page
public class MainActivity extends AppCompatActivity {

    private static  int SPLASH_SCREEN=3000;

    Animation top_animation , bottom_animation;
    ImageView iv_myAppLogo;
    TextView tv_myAppName  , tv_anytime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        top_animation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        iv_myAppLogo = findViewById(R.id.iv_myAppLogo);
        tv_myAppName = findViewById(R.id.tv_myAppName);
        tv_anytime = findViewById(R.id.tv_anytime);

        iv_myAppLogo.setAnimation(top_animation);
        tv_myAppName.setAnimation(bottom_animation);
        tv_anytime.setAnimation(bottom_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this , dashboard.class);

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(iv_myAppLogo,"logo_image");
                pairs[1] = new Pair<View,String>(tv_myAppName,"logo_text");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this , pairs);
                startActivity(intent,options.toBundle());
            }
        },SPLASH_SCREEN);
    }
}