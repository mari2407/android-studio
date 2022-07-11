package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {
public TextView textView;
public RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textview1);
        relativeLayout=(RelativeLayout) findViewById(R.id.relativelayout);
        registerForContextMenu(textView);
        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            super.onCreateContextMenu(menu, v, menuInfo);
    }
}