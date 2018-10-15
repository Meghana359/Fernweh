package com.example.admin.tabtrial.pojo;

public class RestaurantsClass {
    private int mRestaurantImageResourceId;
    private String mRestaurantname;
    private String mRating;

    public RestaurantsClass(int imageResourceId, String restaurantName, String rating) {
        this.mRestaurantImageResourceId = imageResourceId;
        this.mRestaurantname = restaurantName;
        this.mRating = rating;
    }

    public int getmRestaurantImageResourceId() {
        return mRestaurantImageResourceId;
    }

    public String getmRestaurantname() {
        return mRestaurantname;
    }

    public String getmRating() {
        return mRating;
    }
}
