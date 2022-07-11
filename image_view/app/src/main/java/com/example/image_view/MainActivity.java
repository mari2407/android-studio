package com.example.image_view;

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
        ImageView simpleimageviewf1=(ImageView) findViewById(R.id.imagev1);
        ImageView simpleimageviewf2=(ImageView) findViewById(R.id.imagev2);
        ImageView simpleimageviewf3=(ImageView) findViewById(R.id.imagev3);

        simpleimageviewf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "f1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}