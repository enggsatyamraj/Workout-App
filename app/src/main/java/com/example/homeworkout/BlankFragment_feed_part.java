package com.example.homeworkout;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class BlankFragment_feed_part extends Fragment {

    TextView tv_abs_beginner;

    LinearLayout ll_abs_beginner, ll_chest_beginner;




    public BlankFragment_feed_part() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_feed_part, container, false);
        ll_abs_beginner = view.findViewById(R.id.ll_abs_beginner);
        ll_chest_beginner = view.findViewById(R.id.ll_chest_beginner);
        ll_abs_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), abs_page.class);
                startActivity(intent);
            }
        });

        ll_chest_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), chest_beginner.class);
                startActivity(intent);
            }
        });

        return view;

    }
}