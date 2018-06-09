package com.example.chirag.tourguide;

public class DataAttraction {

    private String mPlaceName;
    private String mAddress;
    private double mRating;
    private String mContact;
    private int mImageResourceId;

    public DataAttraction(String mPlaceName, String mAddress, double mRating, String mContact, int imageResource) {
        this.mPlaceName = mPlaceName;
        this.mAddress = mAddress;
        this.mRating = mRating;
        this.mContact = mContact;
        this.mImageResourceId= imageResource;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public double getmRating() {
        return mRating;
    }

    public String getmContact() {
        return mContact;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
