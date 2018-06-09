package com.example.chirag.tourguide.MontrealGuide;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.chirag.tourguide.DataAdapter;
import com.example.chirag.tourguide.DataAttraction;
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

        dataAttractions.add(new DataAttraction("Mount Royal", "1260 Remembrance Road, Montreal, Quebec H3H 1A2", 4.6, "+1 (514) 843-8240", R.drawable.mtroyal));
        dataAttractions.add(new DataAttraction("Notre-Dame Basilica", "110 Notre-Dame St W, Montreal, QC H2Y 1T2", 4.7, "+1 (514) 842-2925", R.drawable.notredam));
        dataAttractions.add(new DataAttraction("Montreal Biodome", "4777 Pierre-de Coubertin Ave, Montreal, QC H1V 1B3", 4.4, "+1 (514) 868-3000", R.drawable.biodome));
        dataAttractions.add(new DataAttraction("Montreal Botanical Garden", "4101 Rue Sherbrooke E, Montréal, QC H1X 2B2", 4.6, "+1 (514) 868-3000", R.drawable.botanicalgarden));
        dataAttractions.add(new DataAttraction("Old Port of Montreal", "333 Rue de la Commune O, Montréal, QC H2Y 2E2", 4.6, "+1 (514) 496-7678", R.drawable.oldport));
        dataAttractions.add(new DataAttraction("Montreal Olympic Stadium", "4141 Pierre-de Coubertin Ave, Montreal, QC H1V 3N7", 4.2, "+1 (514) 252-4141", R.drawable.olympicstadium));
        dataAttractions.add(new DataAttraction("Mount Royal Park", "1260 Remembrance Road, Montreal, Quebec H3H 1A2", 4.7, "+1 (514) 843-8240", R.drawable.mountroyalpark));
        dataAttractions.add(new DataAttraction("Saint Helen's Island", "St Helen's Island, Montreal, QC", 4.0, "", R.drawable.helensisland));


        DataAdapter adapter = new DataAdapter(getActivity(), dataAttractions);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
