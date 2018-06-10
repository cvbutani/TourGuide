package com.example.chirag.tourguide;

import java.io.Serializable;

public class DataAttraction implements Serializable {

    private String mPlaceName;
    private String mAddress;
    private double mRating;
    private String mContact;
    private int mImageResourceId;
    private int mDescription;

    public DataAttraction(String mPlaceName, String mAddress, double mRating, String mContact, int imageResource, int description) {
        this.mPlaceName = mPlaceName;
        this.mAddress = mAddress;
        this.mRating = mRating;
        this.mContact = mContact;
        this.mImageResourceId= imageResource;
        this.mDescription = description;
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

    public int getmDescription() {
        return mDescription;
    }
}
