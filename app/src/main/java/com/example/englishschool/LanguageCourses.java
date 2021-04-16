package com.example.englishschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LanguageCourses extends AppCompatActivity {
TextView textView;
ImageView imageView;
TextView descrText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_courses);
        textView = findViewById(R.id.languagecourses);
        imageView = findViewById(R.id.flag);
        descrText = findViewById(R.id.empty);

        int langcourses = getIntent().getIntExtra("title",0);
        textView.setText(langcourses);
        int image1 = getIntent().getIntExtra("image",0);
        imageView.setImageResource(image1);
        int descr1 = getIntent().getIntExtra("descr",0);
        descrText.setText(descr1);


    }
}