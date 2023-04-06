package com.example.dz3java3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;

import recycler.ContactsAdapter;

public class MainActivity extends AppCompatActivity {
ArrayList<String> arrayList;
    ContactsAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }
    private void initList(){
        arrayList = new ArrayList<>();
        arrayList.add("авмвп");
        arrayList.add("авмвп");
        arrayList.add("авмвп");
        arrayList.add("авмвп");
        adapter= new ContactsAdapter(arrayList);
        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}