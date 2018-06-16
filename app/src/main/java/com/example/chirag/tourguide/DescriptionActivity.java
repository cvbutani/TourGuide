package com.example.chirag.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        if (!getIntent().hasExtra("data")) return;
        if (getIntent().hasExtra("title")) setTitle(getIntent().getStringExtra("title"));

        final DataAttraction attraction = (DataAttraction) getIntent().getSerializableExtra("data");

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
        ratingBar.setRating((float) attraction.getmRating());

        Button map = findViewById(R.id.map_direction);
        map.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = attraction.getmAddress();
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + name);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

            }
        });

        Button call = findViewById(R.id.call_phone);
        call.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = attraction.getmContact();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

    }

}
