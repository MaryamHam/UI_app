package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity2 extends AppCompatActivity {

    SearchView search;
    GridView grid;
    int [] images = {
            R.drawable.computer,
            R.drawable.phones,
            R.drawable.light,
            R.drawable.office
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        search = findViewById(R.id.search);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });


        grid = findViewById(R.id.grid);
//        ArrayAdapter<int> arrayAdapter = new ArrayAdapter<>(this,R.layout.card,images);
//        grid.setAdapter(arrayAdapter);

    }
}