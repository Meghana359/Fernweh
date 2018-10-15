package com.example.admin.tabtrial.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.tabtrial.NearByCities;
import com.example.admin.tabtrial.R;
import com.example.admin.tabtrial.pojo.NearByCitiesClass;

import java.util.ArrayList;

public class NearByCitiesAdapter extends ArrayAdapter<NearByCitiesClass> {

    public NearByCitiesAdapter(Context context, int fragment_nearbycities, ArrayList<NearByCitiesClass> cities) {
        super(context, fragment_nearbycities, cities);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_nearbycities, parent, false);
        }
        NearByCitiesClass currentCity = getItem(position);

        ImageView image = listItemView.findViewById(R.id.nearByCitiesImage);
        image.setImageResource(currentCity.getmImageResourceId());
        TextView nameTextView = listItemView.findViewById(R.id.CityName);
        nameTextView.setText(currentCity.getmCityname());
        TextView albumTextView = listItemView.findViewById(R.id.distance);
        albumTextView.setText(currentCity.getmDistance());
        return listItemView;
    }

}
