package com.example.tjc_recyclerview_login_inprogress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private ArrayList<ExampleItem> mExampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.ic_add_circle_outline, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_assessment, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_bluetooth_audio, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_camera, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_queue_play_next, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_bluetooth_audio, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_camera, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_queue_play_next, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_bluetooth_audio, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_camera, "Line1", "Line2"));
        mExampleList.add(new ExampleItem(R.drawable.ic_queue_play_next, "Line1", "Line2"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList); //To extract the data from database

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
