package com.example.homeworkout;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.homeworkout.ui.login.WorkoutSettings;

public class BlankFragment_settings extends Fragment {

    TextView workout_setting, generalSettings;



    public BlankFragment_settings() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank_settings, container, false);
        workout_setting = view.findViewById(R.id.workout_setting);
        generalSettings = view.findViewById(R.id.generalSettings);
        workout_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getContext(), WorkoutSettings.class);
                startActivity(intent);
            }
        });

        generalSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), generalSettings.getClass());
                startActivity(intent);
            }
        });
        return view;
    }
}