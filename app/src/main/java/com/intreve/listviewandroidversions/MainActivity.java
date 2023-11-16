package com.intreve.listviewandroidversions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.AsyncListDiffer;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);

        String[] androidVersions = {
                "Cupcake",
                "Donut",
                "Eclair",
                "FroYo",
                "Gingerbread",
                "Honeycomb",
                "Ice Cream Sandwich",
                "Jelly Bean",
                "KitKat",
                "Lollipop",
                "Marshmallow",
                "Nougat",
                "Oreo",
                "Pie",
                "Android 10",
                "Android 11",
                "Android 12"
        };


        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,androidVersions);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            // Get the selected item
            String selectedItem = (String) parent.getItemAtPosition(position);

            // Show a toast with the selected item
            Toast.makeText(MainActivity.this, "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
        });




    }
}