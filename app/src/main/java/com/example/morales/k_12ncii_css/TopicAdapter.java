package com.example.morales.k_12ncii_css;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Morales on 10/18/2016.
 */
public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder>{

    Context topicContext;
    ArrayList<Information> topicData;
    LayoutInflater topicInflater;


    public TopicAdapter(Context topicContext, ArrayList<Information> topicData) {

        this.topicContext = topicContext;
        this.topicData = topicData;
        topicInflater = LayoutInflater.from(topicContext);

    }

    @Override
    public TopicViewHolder onCreateViewHolder(ViewGroup topicParent, int position) {

        View topicView = topicInflater.inflate(R.layout.topic1_view, topicParent, false);
        TopicViewHolder topicHolder = new TopicViewHolder(topicView);

        return topicHolder;
    }

    @Override
    public void onBindViewHolder(TopicViewHolder topicViewHolder, int position) {

        topicViewHolder.topicTextView.setText(topicData.get(position).title);
        topicViewHolder.topicImageView.setImageResource(topicData.get(position).imageId);

    }

    @Override
    public int getItemCount() {
        return topicData.size();
    }

    class TopicViewHolder extends RecyclerView.ViewHolder{

        TextView topicTextView;
        ImageView topicImageView;

        public TopicViewHolder(View topicItemView) {
            super(topicItemView);

            topicTextView = (TextView) topicItemView.findViewById(R.id.topictxv_row);
            topicImageView = (ImageView) topicItemView.findViewById(R.id.topicimg_row);
        }
    }
}
