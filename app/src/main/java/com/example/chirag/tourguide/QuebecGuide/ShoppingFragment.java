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
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<DataAttraction> dataAttractions = new ArrayList<>();

        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_centre_eaton),
                getString(R.string.shop_address_centre_eaton),
                4.2,
                getString(R.string.shop_contact_centre_eaton),
                R.drawable.eatoncenter,
                R.string.shopping_centre_eaton));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_montreal_trust),
                getString(R.string.shop_address_montreal_trust),
                4.1,
                getString(R.string.shop_contact_montreal_trust),
                R.drawable.montrealtrust,
                R.string.shopping_montreal_trust));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_promenades),
                getString(R.string.shop_address_promenades),
                4.0,
                getString(R.string.shop_contact_promenades),
                R.drawable.promenades,
                R.string.shopping_promenades));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_les_cours),
                getString(R.string.shop_address_les_cours),
                4.0,
                getString(R.string.shop_contact_les_cours),
                R.drawable.lescours,
                R.string.shopping_les_cours));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_complexe_desjardins),
                getString(R.string.shop_address_complexe_desjardins),
                4.3,
                getString(R.string.shop_contact_complexe_desjardins),
                R.drawable.complexedesjardins,
                R.string.shopping_complexe_desjardins));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_ville_marie),
                getString(R.string.shop_address_ville_marie),
                4.2,
                getString(R.string.shop_contact_ville_marie),
                R.drawable.villemarie,
                R.string.shopping_ville_marie));



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
