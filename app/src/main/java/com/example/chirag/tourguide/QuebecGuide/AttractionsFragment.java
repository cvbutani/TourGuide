package com.example.chirag.tourguide.QuebecGuide;


import android.content.Intent;
import android.os.Bundle;
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
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<DataAttraction> dataAttractions = new ArrayList<>();

        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_chateau_fortenac),
                getString(R.string.attr_address_chateau_fortenac),
                4.6,
                getString(R.string.attr_contact_chateau_fortenac),
                R.drawable.chateaufortenac,
                R.string.attraction_chateau_fortenac));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_montmorency_falls),
                getString(R.string.attr_address_montmorency_falls),
                4.6,
                getString(R.string.attr_contact_montmorency_falls),
                R.drawable.montmorencyfalls,
                R.string.attraction_montmorency_falls));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_citadelle_quebec),
                getString(R.string.attr_address_citadelle_quebec),
                3.6,
                getString(R.string.attr_contact_citadelle_quebec),
                R.drawable.citadelleneige,
                R.string.attraction_citadelle_quebec));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_petit_champlain),
                getString(R.string.attr_address_petit_champlain),
                4.7,
                getString(R.string.attr_contact_petit_champlain),
                R.drawable.petitchamplain,
                R.string.attraction_petit_champlain));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_plains_abraham),
                getString(R.string.attr_address_plains_abraham),
                4.2,
                getString(R.string.attr_contact_plains_abraham),
                R.drawable.plainsabraham,
                R.string.attraction_plains_abraham));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_muse_civilisation),
                getString(R.string.attr_address_muse_civilisation),
                4.5,
                getString(R.string.attr_contact_muse_civilisation),
                R.drawable.museecivilisation,
                R.string.attraction_muse_civilisation));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_battlefiels_park),
                getString(R.string.attr_address_battlefiels_park),
                4.6,
                getString(R.string.attr_contact_battlefiels_park),
                R.drawable.battlefieldspark,
                R.string.attraction_battlefiels_park));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_aquarium_quebec),
                getString(R.string.attr_address_aquarium_quebec),
                4.3,
                getString(R.string.attr_contact_aquarium_quebec),
                R.drawable.aquariumquebec,
                R.string.attraction_aquarium_quebec));
        dataAttractions.add(new DataAttraction(
                getString(R.string.attr_place_beaus_arts),
                getString(R.string.attr_address_beaus_arts),
                4.6,
                getString(R.string.attr_contact_beaus_arts),
                R.drawable.beausarts,
                R.string.attraction_beaus_arts));


        DataAdapter adapter = new DataAdapter(getActivity(), dataAttractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DescriptionActivity.class);

                DataAttraction data = dataAttractions.get(position);

                intent.putExtra("data", data);
                intent.putExtra("title","Attractions");
                startActivity(intent);
            }
        });

        return rootView;
    }

}
