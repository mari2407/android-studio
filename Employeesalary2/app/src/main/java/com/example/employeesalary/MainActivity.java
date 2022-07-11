package com.example.employeesalary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.empsalary);
        e2=(EditText) findViewById(R.id.emptax);
        e3=(EditText) findViewById(R.id.netsal);
        e4=(EditText) findViewById(R.id.edtext1);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double salary=Double.parseDouble(e1.getText().toString());
                double tax;
                if (salary>50000)
                {
                    tax=salary*10/100;

                }
                else if (salary>30000)
                {
                    tax=salary*5/100;
                }
                else
                {
                    tax=0;
                }
                e2.setText(String.valueOf(tax));
                double netsal=salary-tax;
                e3.setText(String.valueOf(netsal));
            }
        });
    }
}