package com.example.team_cs_go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ListView listView = findViewById(R.id.list);//получить

        String[] list = getResources().getStringArray(R.array.array);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        listView.setAdapter(adapter);

        //нажатие на элементы ListView
        listView.setOnItemClickListener((adapterView, view, position, id) -> {
            String select = list[position];
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("arrays", select);

            startActivity(intent);
        });
    }
}