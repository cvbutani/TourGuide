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
                getString(R.string.place_mount_royal),
                getString(R.string.address_mount_royal),
                4.6,
                getString(R.string.contact_mount_royal),
                R.drawable.mtroyal,
                R.string.mount_royal));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_notre_dame_basilica),
                getString(R.string.address_notre_dame_basilica),
                4.7,
                getString(R.string.contact_notre_dame_basilica),
                R.drawable.notredam,
                R.string.notre_dame_basilica));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_monreal_biodome),
                getString(R.string.address_montreal_biodome),
                4.4,
                getString(R.string.contact_montral_botanical_garden),
                R.drawable.biodome,
                R.string.montreal_biodome));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_montreal_botanical_garden),
                getString(R.string.address_montreal_botanical_garden),
                4.6,
                getString(R.string.contact_montreal_botanical_garden),
                R.drawable.botanicalgarden,
                R.string.botanical_garden));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_port_of_montreal),
                getString(R.string.address_port_of_montreal),
                4.6,
                getString(R.string.contact_port_of_montreal),
                R.drawable.oldport,
                R.string.port_of_montreal));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_olympic_stadium),
                getString(R.string.address_olympic_stadium),
                4.2,
                getString(R.string.contact_olympic_stadium),
                R.drawable.olympicstadium,
                R.string.olympic_stadium));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_royal_park),
                getString(R.string.address_royal_park),
                4.7,
                getString(R.string.contact_royal_park),
                R.drawable.mountroyalpark,
                R.string.royal_park));
        dataAttractions.add(new DataAttraction(
                getString(R.string.place_helen_island),
                getString(R.string.address_helen_island),
                4.0, "",
                R.drawable.helensisland,
                R.string.helen_park));


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
