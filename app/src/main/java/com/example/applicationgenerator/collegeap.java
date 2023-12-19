package com.example.applicationgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class collegeap extends AppCompatActivity {
    TextView name,scname,scadd,subject,date,para;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collegeap);
        scname=(TextView) findViewById(R.id.schoolname);
        scadd=(TextView) findViewById(R.id.schooladd);
        subject=(TextView) findViewById(R.id.subject);
        para=(TextView) findViewById(R.id.para);
        name=(TextView) findViewById(R.id.endname);

        Intent intent=getIntent();
        String aname=intent.getStringExtra("dname");
        String ascname=intent.getStringExtra("dscname");
        String ascadd=intent.getStringExtra("dscadd");
        String asubject=intent.getStringExtra("dsubject");
        String adate=intent.getStringExtra("ddate");
        String adays=intent.getStringExtra("ddays");
        scname.setText(ascname+",");
        scadd.setText(ascadd+",");
        name.setText(aname);
        subject.setText("Subject-"+asubject);
        para.setText(para.getText().toString().replace("name",aname));
        para.setText(para.getText().toString().replace("subject",asubject));
        para.setText(para.getText().toString().replace("Dayys",adays));
        para.setText(para.getText().toString().replace("start",adate));
        para.setText(para.getText().toString().replace("name",aname));

        String first=adate.toString().substring(0,2);
        int enddate=Integer.parseInt(first);
        int edays=Integer.parseInt(adays);
        int total=enddate+edays;

        String leave= String.valueOf(total);
        para.setText(para.getText().toString().replace("end",leave));

    }
}