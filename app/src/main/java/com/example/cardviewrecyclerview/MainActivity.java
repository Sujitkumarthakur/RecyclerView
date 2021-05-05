package com.example.cardviewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Customword> arrlist= new ArrayList<Customword>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arrlist.add(new Customword(getString(R.string.Family), R.drawable.ima_1));
        arrlist.add(new Customword(getString(R.string.Education), R.drawable.ima_2));
        arrlist.add(new Customword(getString(R.string.Culture),R.drawable.ima_3));
        arrlist.add(new Customword(getString(R.string.Friends),R.drawable.ima_1));
        arrlist.add(new Customword(getString(R.string.Relationalship),R.drawable.ima_1));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerViewAdapter rvv= new RecyclerViewAdapter(this,arrlist);
        recyclerView.setAdapter(rvv);
    }
}