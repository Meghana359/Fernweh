package com.example.admin.tabtrial;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Places();
        } else if (position == 1) {
            return new Shopping();
        } else if (position == 2) {
            return new Restaurants();
        } else {
            return new NearByCities();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.places);
            case 1:
                return mContext.getString(R.string.shopping);
            case 2:
                return mContext.getString(R.string.restaurants);
            case 3:
                return mContext.getString(R.string.nearByCities);
            default:
                return null;
        }
    }

}