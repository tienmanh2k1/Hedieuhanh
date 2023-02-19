package com.example.hedieuhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button btnAdd;

    List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.hdh_listview);
        btnAdd = findViewById(R.id.btn_add);

        for (int i = 0 ; i < 100 ; i++){
            stringList.add("HDH : " + i);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.activity_hdh,R.id.title,stringList);
        listView.setAdapter(arrayAdapter);

    }
}