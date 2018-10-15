package com.example.admin.tabtrial.pojo;

import com.example.admin.tabtrial.NearByCities;

public class NearByCitiesClass {
    private int mImageResourceId;
    private String mCityname;
    private String mDistance;

    public NearByCitiesClass(int imageResourceId, String cityName, String distance) {
        this.mImageResourceId = imageResourceId;
        this.mCityname = cityName;
        this.mDistance = distance;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmCityname() {
        return mCityname;
    }

    public String getmDistance() {
        return mDistance;
    }
}
