package com.example.chirag.tourguide;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        if(!getIntent().hasExtra("data")) return;

        DataAttraction attraction = (DataAttraction) getIntent().getSerializableExtra("data");

        ImageView image = findViewById(R.id.montreal_image);
        image.setImageResource(attraction.getmImageResourceId());

        TextView name = findViewById(R.id.text_view_new);
        name.setText(attraction.getmPlaceName());

        TextView contact = findViewById(R.id.des_phone);
        contact.setText(attraction.getmContact());

        TextView address = findViewById(R.id.des_address);
        address.setText(attraction.getmAddress());

        TextView description = findViewById(R.id.description);
        description.setText(attraction.getmDescription());

        RatingBar ratingBar = findViewById(R.id.des_rating);
        ratingBar.setRating((float)attraction.getmRating());

    }
}
