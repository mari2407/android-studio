package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        ImageView simpleimageviewf1=(ImageView) findViewById(R.id.imagev1);
        ImageView simpleimageviewf2=(ImageView) findViewById(R.id.imagev2);
        ImageView simpleimageviewf3=(ImageView) findViewById(R.id.imagev3);
        ImageView simpleimageviewf4=(ImageView)findViewById(R.id.imagev4);
        simpleimageviewf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "f4", Toast.LENGTH_SHORT).show();
            }
        });
        simpleimageviewf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "f3", Toast.LENGTH_SHORT).show();
            }
        });
simpleimageviewf2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "f2", Toast.LENGTH_SHORT).show();
    }
});
        simpleimageviewf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "f1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

