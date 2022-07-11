package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText ed1,ed2;
TextView tx1;
int counter =3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        ed1=(EditText) findViewById(R.id.edittext);
        ed2=(EditText) findViewById(R.id.edittext2);
        tx1=(TextView) findViewById(R.id.textview3);
        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("mari") && ed2.getText().toString().equals("mari"))
                {
                    Toast.makeText(MainActivity.this, "redirecting", Toast.LENGTH_SHORT).show();
                }
             else{
                Toast.makeText(MainActivity.this, "wrong cetdentials", Toast.LENGTH_SHORT).show();
                tx1.setVisibility(View.VISIBLE);
                tx1.setBackgroundColor(Color.RED);
                counter--;
                tx1.setText(Integer.toString(counter));
                if ((counter==0)){
                    b1.setEnabled(false);
                }
            }}
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}