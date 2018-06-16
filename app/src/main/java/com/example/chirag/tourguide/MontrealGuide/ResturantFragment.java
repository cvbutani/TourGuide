package com.example.chirag.tourguide.MontrealGuide;


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
                getString(R.string.res_place_damas),
                getString(R.string.res_address_damas),
                4.7,
                getString(R.string.res_contact_damas),
                R.drawable.damas,
                R.string.restaurant_le_damas));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_bouillon_bilk),
                getString(R.string.res_address_bouillon_bilk),
                4.7,
                getString(R.string.res_contact_bouillon_bilk),
                R.drawable.bouillonbilk,
                R.string.bouillon_bilk));
        dataAttractions.add(new DataAttraction(getString(
                R.string.res_place_saint_sushi_bar),
                getString(R.string.res_address_saint_sushi_bar),
                4.4,
                getString(R.string.res_contact_saint_sushi_bar),
                R.drawable.saintsushi,
                R.string.saint_sushi_bar));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_europea),
                getString(R.string.res_address_europea),
                4.6,
                getString(R.string.res_contact_europea),
                R.drawable.europea,
                R.string.restaurant_le_eueropa));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_regine_cafe),
                getString(R.string.res_address_regine_cafe),
                4.6,
                getString(R.string.res_contact_regine_cafe),
                R.drawable.reginecafe,
                R.string.regine_cafe));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_dinette_triple_crown),
                getString(R.string.res_address_dinette_triple_crown),
                4.2,
                getString(R.string.res_contact_dinette_triple_crown),
                R.drawable.dtcmenu,
                R.string.dinette_triple_crown));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_cheskie_boulangrie),
                getString(R.string.res_address_cheskie_boulangrie),
                3.5,
                getString(R.string.res_contact_cheskie_boulangrie),
                R.drawable.cheskieboulangerie,
                R.string.cheskie_bulangerie));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_india_oven),
                getString(R.string.res_address_india_oven),
                4.0,
                getString(R.string.res_contact_india_oven),
                R.drawable.indianrest,
                R.string.restaurant_india_oven));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_chase_et_peche),
                getString(R.string.res_address_chase_et_peche),
                4.0,
                getString(R.string.res_contact_chase_et_peche),
                R.drawable.leclub,
                R.string.le_club_chasse_et_peche));
        dataAttractions.add(new DataAttraction(
                getString(R.string.res_place_le_taj),
                getString(R.string.res_address_le_taj),
                4.2,
                getString(R.string.res_contact_le_taj),
                R.drawable.letaj,
                R.string.le_taj));

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
