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
                getString(R.string.night_place_drague_club),
                getString(R.string.night_address_drague_club),
                4.3,
                getString(R.string.night_contact_drague_club),
                R.drawable.dragueclub,
                R.string.nightlife_drague_club));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_bar_sacrilege),
                getString(R.string.night_address_bar_sacrilege),
                4.4,
                getString(R.string.night_contact_bar_sacrilege),
                R.drawable.barsacrilege,
                R.string.nightlife_bar_sacrilege));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_foubar),
                getString(R.string.night_address_foubar),
                4.3,
                getString(R.string.night_contact_foubar),
                R.drawable.lefou,
                R.string.nightlife_foubar));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_la_piazz),
                getString(R.string.night_address_la_piazz),
                4.6,
                getString(R.string.night_contact_la_piazz),
                R.drawable.lapiazza,
                R.string.nightlife_la_piazz));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_bar_ste_angele),
                getString(R.string.night_address_bar_ste_angele),
                4.0,
                getString(R.string.night_contact_bar_ste_angele),
                R.drawable.barsteangele,
                R.string.nightlife_bar_ste_angele));
        dataAttractions.add(new DataAttraction(
                getString(R.string.night_place_societe_cigare),
                getString(R.string.night_address_societe_cigare),
                4.9,
                getString(R.string.night_contact_societe_cigare),
                R.drawable.societecigare,
                R.string.nightlife_societe_cigare));



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
