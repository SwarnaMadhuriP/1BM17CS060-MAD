package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3;
    String name,reg,dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);
        Intent i = getIntent();

        name=i.getStringExtra("name_k");
        reg=i.getStringExtra("reg_k");
        dept=i.getStringExtra("dept_k");
        t1.setText(name);
        t2.setText(reg);
        t3.setText(dept);

    }

}
