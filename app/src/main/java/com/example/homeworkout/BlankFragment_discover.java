package com.example.homeworkout;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class BlankFragment_discover extends Fragment {

    private ImageView image_view_clock;
    private Calendar selectedDate = Calendar.getInstance();
    private ImageView imageView;
    private TextView textView;


    public BlankFragment_discover() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_discover, container, false);
        image_view_clock = view.findViewById(R.id.image_view_clock);
        imageView = view.findViewById(R.id.imageView);
        textView = view.findViewById(R.id.textView);




        return view;
    }


}
