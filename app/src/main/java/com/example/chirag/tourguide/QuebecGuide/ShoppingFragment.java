package com.example.chirag.tourguide.QuebecGuide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
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

    private Button button;

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        final ArrayList<DataAttraction> dataAttractions = new ArrayList<>();

        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_galeries_capitale),
                getString(R.string.shop_address_galeries_capitale),
                4.3,
                getString(R.string.shop_contact_galeries_capitale),
                R.drawable.galeriescapitale,
                R.string.shopping_galeries_capitale));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_laurier_quebec),
                getString(R.string.shop_address_laurier_quebec),
                4.4,
                getString(R.string.shop_contact_laurier_quebec),
                R.drawable.laurierquebec,
                R.string.shopping_laurier_quebec));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_quartier_champlain),
                getString(R.string.shop_address_quartier_champlain),
                4.7,
                getString(R.string.shop_contact_quartier_champlain),
                R.drawable.quartuerpetit,
                R.string.shopping_quartier_champlain));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_stefoy),
                getString(R.string.shop_address_stefoy),
                4.4,
                getString(R.string.shop_contact_stefoy),
                R.drawable.stefoy,
                R.string.shopping_stefoy));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_da_la_cite),
                getString(R.string.shop_address_da_la_cite),
                4.1,
                getString(R.string.shop_contact_da_la_cite),
                R.drawable.delacite,
                R.string.shopping_da_la_cite));
        dataAttractions.add(new DataAttraction(
                getString(R.string.shop_place_benjo),
                getString(R.string.shop_address_benjo),
                4.6,
                getString(R.string.shop_contact_benjo),
                R.drawable.benjo,
                R.string.shopping_benjo));


        DataAdapter adapter = new DataAdapter(getActivity(), dataAttractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DescriptionActivity.class);

                DataAttraction data = dataAttractions.get(position);

                intent.putExtra("data",data);
                intent.putExtra("title", "Shopping");
                startActivity(intent);
            }
        });

      return rootView;
    }
}
