package com.example.admin.tabtrial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.tabtrial.Adapters.ShoppingAdapter;
import com.example.admin.tabtrial.pojo.ShoppingClass;

import java.util.ArrayList;

public class Shopping extends Fragment {

    public Shopping() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<ShoppingClass> area = new ArrayList<>();
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea1)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea2)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea3)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea4)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea5)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea6)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea7)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea8)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea9)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea10)));
        area.add(new ShoppingClass(getContext().getString(R.string.shoppingArea11)));

        ShoppingAdapter adapter = new ShoppingAdapter(getContext(), R.layout.fragment_shopping, area);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

}
