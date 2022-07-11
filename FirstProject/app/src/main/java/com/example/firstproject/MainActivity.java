package com.example.firstproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText enteryourphone,enterotp;
TextView t,tt;
Button b1,b2;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enteryourphone=(EditText) findViewById(R.id.edittext1);
        enterotp=(EditText) findViewById(R.id.edittext2);
        b1=(Button) findViewById(R.id.getotp);
        b2=(Button) findViewById(R.id.verifyotp);
        t=(TextView) findViewById(R.id.textview1);
        tt=(TextView) findViewById(R.id.textview2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterotp.setText("");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteryourphone.setText("");

            }



        });

    }
}