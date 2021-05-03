package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<String> arr=new ArrayList<>();
    /* RecyclerView rv; */

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr.add("Suit");
        arr.add("Suit");
        arr.add("Suit");
        arr.add("Suit");
        arr.add("Suit");
        arr.add("Suit");
        arr.add("Suit");

        //Setup RecyclerView && Adapter:

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RLayout);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

      RecyclerViewAdapter rvv= new RecyclerViewAdapter(this, arr);
      recyclerView.setAdapter(rvv);
    }
}