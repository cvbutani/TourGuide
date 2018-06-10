package com.example.chirag.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    private Bundle bundle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        bundle = getIntent().getExtras();

        setTitle(getString(R.string.title_activity_attractions));

        ImageView image = findViewById(R.id.montreal_image);
        image.setImageResource(bundle.getInt(BundlePair.PLACE_IMAGE));

        TextView name = findViewById(R.id.text_view_new);
        name.setText(bundle.getString(BundlePair.PLACE_NAME));

        TextView contact = findViewById(R.id.des_phone);
        contact.setText(bundle.getString(BundlePair.PLACE_PHONE));

        TextView address = findViewById(R.id.des_address);
        address.setText(bundle.getString(BundlePair.PLACE_ADDRESS));

        TextView description = findViewById(R.id.description);
        description.setText(bundle.getInt(BundlePair.PLACE_DESCRIPTION));

        RatingBar ratingBar = findViewById(R.id.des_rating);
        ratingBar.setRating((float)bundle.getDouble(BundlePair.PLACE_RATING));


    }
}
