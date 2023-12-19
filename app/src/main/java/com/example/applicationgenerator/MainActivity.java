package com.example.applicationgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView school,office,college;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        office=(ImageView) findViewById(R.id.office);
        school=(ImageView) findViewById(R.id.school);
        college=(ImageView) findViewById(R.id.college);

       office.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent of=new Intent(MainActivity.this, officedata.class);
               startActivity(of);
           }
       });
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sc=new Intent(MainActivity.this, schooldata.class);
                startActivity(sc);
            }
        });
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cl=new Intent(MainActivity.this, collegedata.class);
                startActivity(cl);
            }
        });

    }
}