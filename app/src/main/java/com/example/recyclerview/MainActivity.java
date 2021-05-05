package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<customword> arr=new ArrayList<customword>();
    /* RecyclerView rv; */

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       arr.add(new customword("Sujit", getString(R.string.meaning)));
        arr.add(new customword("Sujit", getString(R.string.meaning1)));
        arr.add(new customword("Sujit", getString(R.string.meaning3)));
        arr.add(new customword("Sujit", getString(R.string.meaning1)));

        //Setup RecyclerView && Adapter:

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

      RecyclerViewAdapter rvv= new RecyclerViewAdapter(this, arr);
      recyclerView.setAdapter(rvv);
    }
}