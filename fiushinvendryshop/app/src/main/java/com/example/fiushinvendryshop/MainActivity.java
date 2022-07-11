package com.example.fiushinvendryshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sp1;
    EditText ed1,ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= findViewById(R.id.qty);
        ed2= findViewById(R.id.tot);
        sp1 = findViewById(R.id.sp1);

        String[] mes = {"Kg","Gr"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,mes);
        sp1.setAdapter(ad);
        b1 = findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = sp1.getSelectedItem().toString();
                double qty = Double.parseDouble(ed1.getText().toString());

                if(item.equals("Kg"))
                {
                    double cal = (qty * 140) ;
                    ed2.setText(String.valueOf(cal));
                }
                else
                {
                    double cal = (qty/1000 * 140) ;
                    ed2.setText(String.valueOf(cal));
                }
            }
        });
    }
}