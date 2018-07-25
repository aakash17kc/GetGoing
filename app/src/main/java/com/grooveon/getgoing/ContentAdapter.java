package com.grooveon.getgoing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<ContentHandler> {
    private Context mContext;

    public ContentAdapter(Context context, ArrayList<ContentHandler> contentHandlers) {
        super(context, 0, contentHandlers);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link ContentHandler} object located at this position in the list
        ContentHandler currentContentHandler = getItem(position);

        TextView attraction = (TextView) listItemView.findViewById(R.id.attraction);
        attraction.setText(currentContentHandler.getmAttractionName());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentContentHandler.getmLocation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.images);
        Glide.with(mContext).load(currentContentHandler.getmImageId()).into(image);


        TextView travelTime = listItemView.findViewById(R.id.travel_time);
        travelTime.setText(currentContentHandler.getmTravelTime());

        TextView timeInterval = listItemView.findViewById(R.id.time_interval);
        timeInterval.setText(currentContentHandler.getmTimeInterval());

        return listItemView;
    }
}