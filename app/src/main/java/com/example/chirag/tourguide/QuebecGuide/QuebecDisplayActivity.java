package com.example.chirag.tourguide.QuebecGuide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.chirag.tourguide.R;

public class QuebecDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.list, new AttractionsFragment())
                .commit();
    }
}
