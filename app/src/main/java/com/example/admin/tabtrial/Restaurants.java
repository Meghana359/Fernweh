package com.example.admin.tabtrial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.tabtrial.Adapters.RestaurantsAdapter;
import com.example.admin.tabtrial.pojo.RestaurantsClass;

import java.util.ArrayList;

public class Restaurants extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<RestaurantsClass> restaurant = new ArrayList<>();
        restaurant.add(new RestaurantsClass(R.drawable.caprese, getContext().getString(R.string.rest1), getContext().getString(R.string.rating1)));
        restaurant.add(new RestaurantsClass(R.drawable.druidgarden, getContext().getString(R.string.rest2), getContext().getString(R.string.rating2)));
        restaurant.add(new RestaurantsClass(R.drawable.jamvar, getContext().getString(R.string.rest3), getContext().getString(R.string.rating3)));
        restaurant.add(new RestaurantsClass(R.drawable.jwkitchen, getContext().getString(R.string.rest4), getContext().getString(R.string.rating4)));
        restaurant.add(new RestaurantsClass(R.drawable.rimnaam, getContext().getString(R.string.rest5), getContext().getString(R.string.rating5)));
        restaurant.add(new RestaurantsClass(R.drawable.yataii, getContext().getString(R.string.rest6), getContext().getString(R.string.rating6)));
        restaurant.add(new RestaurantsClass(R.drawable.saffron, getContext().getString(R.string.rest7), getContext().getString(R.string.rating7)));
        restaurant.add(new RestaurantsClass(R.drawable.timetraveller, getContext().getString(R.string.rest8), getContext().getString(R.string.rating8)));
        restaurant.add(new RestaurantsClass(R.drawable.karavalli, getContext().getString(R.string.rest9), getContext().getString(R.string.rating9)));
        restaurant.add(new RestaurantsClass(R.drawable.zen, getContext().getString(R.string.rest10), getContext().getString(R.string.rating10)));

        RestaurantsAdapter adapter = new RestaurantsAdapter(getContext(), R.layout.fragment_restaurant, restaurant);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }
}
