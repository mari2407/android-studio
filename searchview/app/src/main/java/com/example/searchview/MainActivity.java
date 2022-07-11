package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
SearchView searchView;
ListView listView;
ArrayList <String> List;
ArrayAdapter <String> Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView=(SearchView)findViewById(R.id.search_view);
        listView=(ListView) findViewById(R.id.lv1);
        List= new ArrayList<>();
        List.add("Apple");
        List.add("Banana");
        List.add("Pineapple");
        List.add("Orange");
        List.add("Lychee");
        List.add("Gavava");
        List.add("Peech");
        List.add("Melon");
        List.add("Watermelon");
        List.add("Papaya");
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,List);
        listView.setAdapter(Adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query ) {
                if(List.contains(query)){
                    Adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(MainActivity.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}