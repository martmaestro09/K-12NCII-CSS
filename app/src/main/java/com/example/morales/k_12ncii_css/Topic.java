package com.example.morales.k_12ncii_css;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class Topic extends Fragment {

    RecyclerView topicRecyclerView;
    TopicAdapter topicAdapter;


    public Topic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View topicview = inflater.inflate(R.layout.activity_topic1, container, false);

        topicRecyclerView = (RecyclerView) topicview.findViewById(R.id.topicRecycleView);
        topicAdapter = new TopicAdapter(getActivity(), TopicData.getTopicData());
        topicRecyclerView.setAdapter(topicAdapter);
        topicRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return topicview;
    }

}
