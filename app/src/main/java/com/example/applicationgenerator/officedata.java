package com.example.applicationgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class officedata extends AppCompatActivity {
    EditText name,scname,scadd,subject,date,days;
    Button generate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officedata);
        name=(EditText) findViewById(R.id.name);
        scname=(EditText) findViewById(R.id.schoolname);
        scadd=(EditText) findViewById(R.id.schoolad);
        subject=(EditText) findViewById(R.id.subject);
        date=(EditText) findViewById(R.id.date);
        days=(EditText) findViewById(R.id.days);
        generate=(Button) findViewById(R.id.scgenerate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String dname=name.getText().toString();
                String dscname=scname.getText().toString();
                String dscadd=scadd.getText().toString();
                String dsubject=subject.getText().toString();
                String ddate=date.getText().toString();
                String ddays=days.getText().toString();

                Intent intent=new Intent(officedata.this, officeap.class);
                intent.putExtra("dname",dname);
                intent.putExtra("dscname",dscname);
                intent.putExtra("dscadd",dscadd);
                intent.putExtra("dsubject",dsubject);
                intent.putExtra("ddate",ddate);
                intent.putExtra("ddays",ddays);
                startActivity(intent);
            }
        });

    }
}