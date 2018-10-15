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
import com.example.admin.tabtrial.pojo.PlacesClass;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<PlacesClass> {

    public PlacesAdapter(Context context, int fragment_places, ArrayList<PlacesClass> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_places, parent, false);
        }
        PlacesClass currentPlace = getItem(position);

        ImageView image = listItemView.findViewById(R.id.imagePlaces);
        image.setImageResource(currentPlace.getPlacesImageResourceId());
        TextView nameTextView = listItemView.findViewById(R.id.placeName);
        nameTextView.setText(currentPlace.getmPlaceName());
        return listItemView;
    }
}
