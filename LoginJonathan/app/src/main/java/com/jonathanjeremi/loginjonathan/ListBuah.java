package com.jonathanjeremi.loginjonathan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListBuah extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_buah);

        //Making a listView
        listView = (ListView) findViewById(R.id.invent);
        String[] values = new String[]{
                "Jeruk", "Apel", "Stroberi", "Nangka", "Pisang", "Semangka", "Melon"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);
    }
}