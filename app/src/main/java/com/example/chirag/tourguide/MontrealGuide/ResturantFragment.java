package com.example.chirag.tourguide.MontrealGuide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.chirag.tourguide.BundlePair;
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

        dataAttractions.add(new DataAttraction("Restaurant Le Damas", "1201 Ave Van Horne, Outremont, QC H2V 1K4", 4.7, "+1 (514) 439-5435", R.drawable.damas, R.string.montreal));
        dataAttractions.add(new DataAttraction("Bouillon Bilk", "1595 St Laurent Blvd, Montréal, QC H2X 2S9", 4.7, "+1 (514) 845-1595", R.drawable.bouillonbilk, R.string.montreal));
        dataAttractions.add(new DataAttraction("Saint Sushi Bar", "424 Avenue Duluth, Montréal H2L 1A3", 4.4, "+1 (514) 507-7537", R.drawable.saintsushi, R.string.montreal));
        dataAttractions.add(new DataAttraction("Restaurant Le Europea", "1227 de la montagne, Montréal, QC, H3G 1Z2", 4.6, "+1 (514) 398-9229", R.drawable.europea, R.string.montreal));
        dataAttractions.add(new DataAttraction("Régine Café", "1840 Rue Beaubien Est, Montréal, QC H2G 1L6", 4.6, "+1 (514) 903-0676", R.drawable.reginecafe, R.string.montreal));
        dataAttractions.add(new DataAttraction("Dinette Triple Crown", "6704 Rue Clark, Montréal, QC, H2S 3E9", 4.2, "+1 (514) 272-2617", R.drawable.dtcmenu, R.string.montreal));
        dataAttractions.add(new DataAttraction("Cheskie's Boulangerie", "359 bernard ouest, Montréal, QC, H2V 1T6", 3.5, "+1 (514) 271-2253", R.drawable.cheskieboulangerie, R.string.montreal));
        dataAttractions.add(new DataAttraction("Restaurant India's Oven", "454 A Rue Jean-Talon Ouest, Montreal, QC H3N 1R3", 4.0, "+1 (514) 509-8678", R.drawable.indianrest, R.string.montreal));
        dataAttractions.add(new DataAttraction("Le Club Chasse et Pêche", "423, rue St-Claude, Montréal, QC, H2Y 3B6", 4.0, "+1 (514) 861-1112", R.drawable.leclub, R.string.montreal));
        dataAttractions.add(new DataAttraction("Le Taj", "2077 Stanley St, Montreal, QC H3A 1R7", 4.2, "+1 (514) 845-9015", R.drawable.letaj, R.string.montreal));

        DataAdapter adapter = new DataAdapter(getActivity(), dataAttractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DescriptionActivity.class);

                DataAttraction data = dataAttractions.get(position);

                Bundle bundle = new Bundle();

                bundle.putString(BundlePair.PLACE_NAME, data.getmPlaceName());
                bundle.putString(BundlePair.PLACE_ADDRESS, data.getmAddress());
                bundle.putInt(BundlePair.PLACE_IMAGE, data.getmImageResourceId());
                bundle.putDouble(BundlePair.PLACE_RATING, data.getmRating());
                bundle.putString(BundlePair.PLACE_PHONE, data.getmContact());
                bundle.putInt(BundlePair.PLACE_DESCRIPTION, data.getmDescription());

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

        return rootView;
    }

}
