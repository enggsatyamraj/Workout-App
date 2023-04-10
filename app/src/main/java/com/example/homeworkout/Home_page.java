package com.example.homeworkout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_page extends AppCompatActivity {


    BottomNavigationView bottom_navigation;

    FragmentContainerView frag_container;

    //RelativeLayout relative_layout_top;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottom_navigation = findViewById(R.id.bottom_navigation);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.nav_feed){
                    frag_load(new BlankFragment_feed_part(), false);
                }
                else if(id == R.id.nav_discover){
                    frag_load(new BlankFragment_discover(), false);
                }
                else if(id==R.id.nav_report){
                    frag_load(new BlankFragment_report(), false);
                }
                else{
                    frag_load(new BlankFragment_settings(), false);
                }
                return true;


            }
        });

        bottom_navigation.setSelectedItemId(R.id.nav_feed);

    }
    public void frag_load(Fragment fragment, boolean flag){
        FragmentManager fragment_manager = getSupportFragmentManager();
        FragmentTransaction fragment_transaction = fragment_manager.beginTransaction();
        if(flag){
            fragment_transaction.add(R.id.frag_container, fragment);
        }
        else{
            fragment_transaction.replace(R.id.frag_container, fragment);
        }
        fragment_transaction.commit();
    }
}