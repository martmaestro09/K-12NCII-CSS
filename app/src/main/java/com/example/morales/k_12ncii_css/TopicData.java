package com.example.morales.k_12ncii_css;

import java.util.ArrayList;

/**
 * Created by Morales on 10/19/2016.
 */
public class TopicData {
    public static ArrayList<Information> getTopicData(){
        ArrayList<Information> topicData = new ArrayList<>();

        int[] images = {
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
        };
        String[] Categories = {"Lecture", "Video", "Assessment"};

        for(int x = 0; x< images.length; x++){

            Information current = new Information();
            current.title = Categories[x];
            current.imageId = images[x];

            topicData.add(current);
        }

        return topicData;
    }
}

