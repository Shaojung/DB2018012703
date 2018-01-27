package com.example.student.db2018012703;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    ArrayList<String> mylist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner);
        mylist.add("蘋果");
        mylist.add("香蕉");
        mylist.add("鳳梨");
        mylist.add("番茄");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, mylist);
        sp.setAdapter(adapter);

    }
}
