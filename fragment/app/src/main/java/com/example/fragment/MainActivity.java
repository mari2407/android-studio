package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import fragment.firstfragment;
import fragment.secondfragment;
import fragment.thirdfragment;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3;
FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=findViewById(R.id.framelayout);
        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        loadfirstfragemnt(new firstfragment());
        loadfragmentwhilebuttonclick(btn1,btn2,btn3);
    }


    private void loadfragmentwhilebuttonclick(Button btn1, Button btn2, Button btn3) {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new firstfragment()).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new secondfragment()).commit();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new thirdfragment()).commit();

            }
        });
    }
    private boolean loadfirstfragemnt(firstfragment firstfragment) {
        if (firstfragment == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, firstfragment).commit();
            return true;
        }
        return false;
    }}