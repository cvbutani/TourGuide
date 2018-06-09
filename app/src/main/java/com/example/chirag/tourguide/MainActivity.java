package com.example.chirag.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout montreal = findViewById(R.id.montreal_layout);

        montreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent montrealIntent = new Intent(MainActivity.this, MontrealActivity.class);
                startActivity(montrealIntent);
            }
        });

        RelativeLayout quebec = findViewById(R.id.quebec_layout);

        quebec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quebecIntent = new Intent(MainActivity.this, QuebecActivity.class);
                startActivity(quebecIntent);
            }
        });
    }
}
