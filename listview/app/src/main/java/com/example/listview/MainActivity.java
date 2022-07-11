package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView simplelist;
String countrulist[]= {"India", "China", "australia", "Portugle", "America", "NewZealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist = (ListView)findViewById(R.id.listview1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textview1, countrulist);
        simplelist.setAdapter(arrayAdapter);
        simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=arrayAdapter.getItem(i);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
            }
        });

    }
}