package com.example.admin.tabtrial.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.tabtrial.R;
import com.example.admin.tabtrial.pojo.PlacesClass;
import com.example.admin.tabtrial.pojo.ShoppingClass;

import java.util.ArrayList;

public class ShoppingAdapter extends ArrayAdapter<ShoppingClass> {


    public ShoppingAdapter(Context context, int fragment_shopping, ArrayList<ShoppingClass> area) {
        super(context, fragment_shopping, area);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_shopping, parent, false);
        }
        ShoppingClass currentArea = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.shoppingPlace);
        nameTextView.setText(currentArea.getArea());
        return listItemView;
    }
}
