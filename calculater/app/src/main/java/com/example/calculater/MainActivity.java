package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText first,second;
TextView ans;
Button b1,b2,b3,b4,b5;
double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText) findViewById(R.id.first);
        second=(EditText) findViewById(R.id.second);
        ans=(TextView) findViewById(R.id.result);
        b1=(Button) findViewById(R.id.btnadd);
        b2=(Button) findViewById(R.id.btnsub);
        b3=(Button) findViewById(R.id.btnmul);
        b4=(Button) findViewById(R.id.btndiv);
        b5=(Button) findViewById(R.id.clear);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(first.getText().toString());
                b=Double.parseDouble(second.getText().toString());
                c=a+b;
                ans.setText("add="+c);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(first.getText().toString());
                b=Double.parseDouble(second.getText().toString());
                c=a-b;
                ans.setText("sub="+c);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(first.getText().toString());
                b=Double.parseDouble(second.getText().toString());
                c=a*b;
                ans.setText("mul="+c);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(first.getText().toString());
                b=Double.parseDouble(second.getText().toString());
                c=a/b;
                ans.setText("div="+c);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Double.parseDouble(first.getText().toString());
                b=Double.parseDouble(second.getText().toString());
                c=0;
                ans.setText("clear="+c);
            }
        });
    }
}