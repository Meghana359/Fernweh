package com.example.admin.tabtrial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.admin.tabtrial.pojo.PlacesClass;
import com.example.admin.tabtrial.Adapters.NearByCitiesAdapter;
import com.example.admin.tabtrial.Adapters.PlacesAdapter;


import java.util.ArrayList;

public class Places extends Fragment {

    public Places() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<PlacesClass> places = new ArrayList<>();
        places.add(new PlacesClass(R.drawable.blorepalace, getContext().getString(R.string.place1)));
        places.add(new PlacesClass(R.drawable.bannerghatta, getContext().getString(R.string.place2)));
        places.add(new PlacesClass(R.drawable.lalbagh, getContext().getString(R.string.place3)));
        places.add(new PlacesClass(R.drawable.museum, getContext().getString(R.string.place4)));
        places.add(new PlacesClass(R.drawable.iskon, getContext().getString(R.string.place5)));
        places.add(new PlacesClass(R.drawable.planetarium, getContext().getString(R.string.place6)));
        places.add(new PlacesClass(R.drawable.wonderla, getContext().getString(R.string.place7)));
        places.add(new PlacesClass(R.drawable.ulsoorlake, getContext().getString(R.string.place8)));
        places.add(new PlacesClass(R.drawable.innovativefilmcity, getContext().getString(R.string.place9)));
        places.add(new PlacesClass(R.drawable.vidhanasoudha, getContext().getString(R.string.place10)));
        places.add(new PlacesClass(R.drawable.ubcity, getContext().getString(R.string.place11)));
        places.add(new PlacesClass(R.drawable.stmarys, getContext().getString(R.string.place12)));

        PlacesAdapter adapter = new PlacesAdapter(getContext(), R.layout.fragment_places, places);
        ListView listView_nearByCities = rootView.findViewById(R.id.list);
        listView_nearByCities.setAdapter(adapter);
        return rootView;

    }
}