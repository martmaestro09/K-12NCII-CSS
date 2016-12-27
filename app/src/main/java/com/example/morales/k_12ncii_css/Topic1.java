package com.example.morales.k_12ncii_css;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class Topic1 extends AppCompatActivity {

    RecyclerView topicRecyclerView;
    TopicAdapter topicAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic1);
        topicRecyclerView = (RecyclerView) findViewById(R.id.topicRecycleView);
        topicAdapter = new TopicAdapter(this, TopicData.getTopicData());
        topicRecyclerView.setAdapter(topicAdapter);
        topicRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar = (Toolbar) findViewById(R.id.topictoolbar);
        setSupportActionBar(toolbar);

    }
}

