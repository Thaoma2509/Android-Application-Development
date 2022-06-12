package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String mNovel_name[], mNovel_author[];
    int mImages[] = {R.drawable.novel0,R.drawable.novel1, R.drawable.novel2, R.drawable.novel3,
            R.drawable.novel4, R.drawable.novel5, R.drawable.novel6};

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNovel_name = getResources().getStringArray(R.array.novel_name);
        mNovel_author = getResources().getStringArray(R.array.novel_author);

        // Create recycler view.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mNovel_name, mNovel_author, mImages);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        Intent intent = new Intent(MainActivity.this, NovelActivity.class);
        mAdapter.getIntent(intent);

    }
}