package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<Animal>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Ant", R.mipmap.fare));
        animals.add(new Animal("Bear", R.mipmap.fare));
        animals.add(new Animal("Bird", R.mipmap.fare));
        animals.add(new Animal("Cat", R.mipmap.fare));
        animals.add(new Animal("Dog", R.mipmap.fare));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}