package com.example.fregment_examble1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM=getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();
                Fragment1 f1=new Fragment1();
                FT.add(R.id.fr1_id,f1);
                FT.addToBackStack("f1");
                FT.commit();

            }
        });
    }
}