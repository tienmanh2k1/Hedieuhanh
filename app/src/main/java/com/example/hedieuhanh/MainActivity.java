package com.example.hedieuhanh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button btnAdd;

    List<String> stringList = new ArrayList<>();
    private List<OperatingSystem> osList = new ArrayList<>();

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



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                OperatingSystem selectedOs = osList.get(position);
                String message = "You selected " + selectedOs.getName() + " " + selectedOs.getVersion();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

    }
}