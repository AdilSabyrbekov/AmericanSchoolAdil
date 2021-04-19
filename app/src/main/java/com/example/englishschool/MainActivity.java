package com.example.englishschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private ConstraintLayout serviceLanguage;
   // private ConstraintLayout serviceCamp;
   // private ConstraintLayout serviceTalking;
   // private ConstraintLayout serviceToefl;
   // private  TextView callbtn;
    //private  ConstraintLayout banner;
    int x = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceLanguage = findViewById(R.id.service_language);
        serviceCamp = findViewById(R.id.service_camp);
        serviceTalking = findViewById(R.id.service_talking);
        serviceToefl = findViewById(R.id.service_toefl);
        callbtn = findViewById(R.id.call_button);
        banner = findViewById(R.id.banner);

        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://google.com";
                Uri myUri = Uri.parse(link);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(myIntent);
            }
        });

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "+996999066996";
                Uri myUri = Uri.parse("tel:" + number);
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);
            }
        });

        serviceLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLanguageCoursesactivity(
                        R.string.app_language,
                        R.drawable.image_1,
                        R.string.service_language_descr
                );
            }
        });
        serviceCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLanguageCoursesactivity(
                        R.string.service_camp,
                        R.drawable.image_2,
                        R.string.service_camp_descr
                );

            }
        });
        serviceTalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLanguageCoursesactivity(
                        R.string.service_talking,
                        R.drawable.image_3,
                        R.string.service_talking_descr
                );

            }
        });
        serviceToefl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLanguageCoursesactivity(
                        R.string.service_toefl,
                        R.drawable.image_4,
                        R.string.service_toefl_descr
                );

            }
        });
    }
    private void  startLanguageCoursesactivity(int titleRes, int imageRes, int descrRes){
        Intent myIntent = new Intent(this,LanguageCourses.class);
        myIntent.putExtra("title", titleRes);
        myIntent.putExtra("image", imageRes);
        myIntent.putExtra("descr", descrRes);
        startActivity(myIntent);
    }
}