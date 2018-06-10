package com.example.chirag.tourguide.MontrealGuide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.chirag.tourguide.R;

public class ResturantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.list, new AttractionsFragment())
                .commit();
    }

}
