package com.example.admin.tabtrial.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.tabtrial.R;
import com.example.admin.tabtrial.pojo.NearByCitiesClass;
import com.example.admin.tabtrial.pojo.RestaurantsClass;

import java.util.ArrayList;

public class RestaurantsAdapter extends ArrayAdapter<RestaurantsClass> {

    public RestaurantsAdapter(Context context, int fragment_restaurant, ArrayList<RestaurantsClass> restaurant) {
        super(context, fragment_restaurant, restaurant);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_restaurant, parent, false);
        }
        RestaurantsClass currentRestaurant = getItem(position);

        ImageView image = listItemView.findViewById(R.id.restaurantImage);
        image.setImageResource(currentRestaurant.getmRestaurantImageResourceId());
        TextView nameTextView = listItemView.findViewById(R.id.restaurantName);
        nameTextView.setText(currentRestaurant.getmRestaurantname());
        TextView ratingTextView = listItemView.findViewById(R.id.res_ratings);
        ratingTextView.setText(currentRestaurant.getmRating());
        return listItemView;
    }
}
