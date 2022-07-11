package com.example.calandar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private CalendarView calandar;
 private TextView date_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calandar=(CalendarView) findViewById(R.id.calanderview1);
        date_view=(TextView) findViewById(R.id.textview1);
        calandar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int mounth, int dayofmounth) {
                String date=dayofmounth+"-"+(mounth+1)+"-"+year;
                date_view.setText(date);

            }
        });
    }
}