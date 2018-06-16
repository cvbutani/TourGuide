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
public class ResturantFragment extends Fragment {


    public ResturantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<DataAttraction> dataAttractions = new ArrayList<>();

        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_legende),
                getString(R.string.res_address_legende),
                4.8,
                getString(R.string.res_contact_legende),
                R.drawable.legende,
                R.string.restaurant_legende));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_saint_amour),
                getString(R.string.res_address_saint_amour),
                4.6,
                getString(R.string.res_contact_saint_amour),
                R.drawable.saintarmour,
                R.string.restaurant_saint_amour));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_toast),
                getString(R.string.res_address_toast),
                4.6,
                getString(R.string.res_contact_toast),
                R.drawable.letoast,
                R.string.restaurant_toast));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_le_continental),
                getString(R.string.res_address_le_continental),
                4.6,
                getString(R.string.res_contact_le_continental),
                R.drawable.continental,
                R.string.restaurant_le_continental));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_anciens_canadiens),
                getString(R.string.res_address_anciens_canadiens),
                4.6,
                getString(R.string.res_contact_anciens_canadiens),
                R.drawable.auxancienscanedians,
                R.string.restaurant_anciens_canadiens));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_sss),
                getString(R.string.res_address_sss),
                4.4,
                getString(R.string.res_contact_sss),
                R.drawable.sss,
                R.string.restaurant_sss));


        DataAdapter adapter = new DataAdapter(getActivity(), dataAttractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DescriptionActivity.class);

                DataAttraction data = dataAttractions.get(position);

                intent.putExtra("data",data);
                intent.putExtra("title", "Restaurants");
                startActivity(intent);

            }
        });

        return rootView;
    }

}
