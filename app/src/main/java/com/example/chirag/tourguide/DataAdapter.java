package com.example.chirag.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends ArrayAdapter {

    public DataAdapter(@NonNull Context context, @NonNull ArrayList<DataAttraction> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_catagory, parent,false);
        }

        DataAttraction data = (DataAttraction) getItem(position);

        ImageView placeImage = listItem.findViewById(R.id.list_item_icon);
        placeImage.setImageResource(data.getmImageResourceId());

        TextView placeName = listItem.findViewById(R.id.text_view);
        placeName.setText(data.getmPlaceName());

        RatingBar placeRating = listItem.findViewById(R.id.place_rating);
        placeRating.setRating((float) data.getmRating());

        TextView placeAddress = listItem.findViewById(R.id.address);
        placeAddress.setText(data.getmAddress());

        TextView placePhone = listItem.findViewById(R.id.phone);
        placePhone.setText(data.getmContact());

        return listItem;
    }
}
