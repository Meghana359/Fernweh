package com.example.admin.tabtrial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.tabtrial.Adapters.NearByCitiesAdapter;
import com.example.admin.tabtrial.pojo.NearByCitiesClass;

import java.util.ArrayList;

public class NearByCities extends Fragment {

    public NearByCities() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<NearByCitiesClass> cities = new ArrayList<>();
        cities.add(new NearByCitiesClass(R.drawable.mysuru, getContext().getString(R.string.city1), getContext().getString(R.string.dist1)));
        cities.add(new NearByCitiesClass(R.drawable.shivanasamudra, getContext().getString(R.string.city2), getContext().getString(R.string.dist2)));
        cities.add(new NearByCitiesClass(R.drawable.kanipakkam, getContext().getString(R.string.city3), getContext().getString(R.string.dist3)));
        cities.add(new NearByCitiesClass(R.drawable.sravanabelagola, getContext().getString(R.string.city4), getContext().getString(R.string.dist4)));
        cities.add(new NearByCitiesClass(R.drawable.srirangapatna, getContext().getString(R.string.city5), getContext().getString(R.string.dist5)));
        cities.add(new NearByCitiesClass(R.drawable.somnathpur, getContext().getString(R.string.city6), getContext().getString(R.string.dist6)));
        cities.add(new NearByCitiesClass(R.drawable.melukote, getContext().getString(R.string.city7), getContext().getString(R.string.dist7)));
        cities.add(new NearByCitiesClass(R.drawable.chunchi, getContext().getString(R.string.city8), getContext().getString(R.string.dist8)));

        NearByCitiesAdapter adapter = new NearByCitiesAdapter(getContext(), R.layout.fragment_nearbycities, cities);
        ListView listView_nearByCities = rootView.findViewById(R.id.list);
        listView_nearByCities.setAdapter(adapter);
        return rootView;

    }

}
