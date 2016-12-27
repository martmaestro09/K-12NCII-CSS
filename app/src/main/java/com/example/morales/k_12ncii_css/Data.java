package com.example.morales.k_12ncii_css;

import java.util.ArrayList;

/**
 * Created by Morales on 10/18/2016.
 */
public class Data {
    public static ArrayList<Information> getData(){
        ArrayList<Information> data = new ArrayList<>();

        int[] images = {
                R.drawable.topic1,
                R.drawable.topic2,
                R.drawable.topic1,
                R.drawable.topic2,
        };
        String[] Categories = {"Topic 1", "Topic 2", "Topic 3", "Topic 4"};

        for(int i = 0; i< images.length; i++){

            Information current = new Information();
            current.title = Categories[i];
            current.imageId = images[i];

            data.add(current);
        }

        return data;
    }

}
