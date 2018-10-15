package com.example.admin.tabtrial.pojo;

public class PlacesClass {
    private int mImageResourceId;
    private String mPlaceName;

    public PlacesClass(int imageResourceId, String placeName) {
        this.mImageResourceId = imageResourceId;
        this.mPlaceName = placeName;
    }

    public int getPlacesImageResourceId() {
        return mImageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }
}
