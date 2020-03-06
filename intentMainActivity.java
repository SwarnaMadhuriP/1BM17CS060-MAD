package com.example.myapplication;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button bt;
    Spinner s;

    String [] dept_array={"CSE","ECE","IT","Mech","Civil"};

    String name,reg,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);
        bt= (Button) findViewById(R.id.button);
        s= (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array);
        s.setAdapter(adapter);

        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                name=e1.getText().toString();
                reg=e2.getText().toString();
                dept=s.getSelectedItem().toString();

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name_k", name);
                i.putExtra("reg_k",reg);
                i.putExtra("dept_k", dept);
                startActivity(i);

            }

        });

    }

}
