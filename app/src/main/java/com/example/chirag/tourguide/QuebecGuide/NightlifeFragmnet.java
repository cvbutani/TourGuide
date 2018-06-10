package com.example.chirag.tourguide.QuebecGuide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.chirag.tourguide.DataAdapter;
import com.example.chirag.tourguide.DataAttraction;
import com.example.chirag.tourguide.DescriptionActivity;
import com.example.chirag.tourguide.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class NightlifeFragmnet extends Fragment {

    public NightlifeFragmnet() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<DataAttraction> dataAttractions = new ArrayList<>();

        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_blvd),
                getString(R.string.night_address_blvd),
                3.1,
                getString(R.string.night_contact_blvd),
                R.drawable.blvd,
                R.string.nightlife_blvd_des));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_rouge_bar),
                getString(R.string.night_address_rouge_bar),
                2.9,
                getString(R.string.night_contact_rouge_bar),
                R.drawable.rouge,
                R.string.nightlife_le_rouge_bar));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_jet_nightclub),
                getString(R.string.night_address_jet_nightclub),
                2.8,
                getString(R.string.night_contact_jet_nightclub),
                R.drawable.jetnightclub,
                R.string.nightlife_jet_nightclub));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_after_hours),
                getString(R.string.night_address_after_hours),
                4.4,
                getString(R.string.night_contact_after_hours),
                R.drawable.stereoafterhour,
                R.string.nightlife_after_hours));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_muzique),
                getString(R.string.night_address_muzique),
                3.0,
                getString(R.string.night_contact_muzique),
                R.drawable.muzique,
                R.string.nightlife_muzique));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_club_649),
                getString(R.string.night_address_club_649),
                3.9,
                getString(R.string.night_contact_club_649),
                R.drawable.club649,
                R.string.nightlife_club_649));



        DataAdapter adapter = new DataAdapter(getActivity(), dataAttractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DescriptionActivity.class);

                DataAttraction data = dataAttractions.get(position);

                intent.putExtra("data",data);

                startActivity(intent);
            }
        });


        return rootView;
    }
}
