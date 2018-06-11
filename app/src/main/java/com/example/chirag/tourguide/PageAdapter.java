package com.example.chirag.tourguide;

import android.content.Context;

import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.chirag.tourguide.MontrealGuide.AttractionsFragment;
import com.example.chirag.tourguide.MontrealGuide.NightlifeFragmnet;
import com.example.chirag.tourguide.MontrealGuide.ResturantFragment;
import com.example.chirag.tourguide.MontrealGuide.ShoppingFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String mClassName;

    public PageAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        mClassName = mContext.getClass().getSimpleName();
        if(mClassName.equals("MontrealActivity")){
            if (position == 0) {
                return new AttractionsFragment();
            } else if (position == 1) {
                return new ResturantFragment();
            } else if (position == 2) {
                return new ShoppingFragment();
            } else {
                return new NightlifeFragmnet();
            }
        } else {
            if (position == 0) {
                return new com.example.chirag.tourguide.QuebecGuide.AttractionsFragment();
            } else if (position == 1) {
                return new com.example.chirag.tourguide.QuebecGuide.ResturantFragment();
            } else if (position == 2) {
                return new com.example.chirag.tourguide.QuebecGuide.ShoppingFragment();
            } else {
                return new com.example.chirag.tourguide.QuebecGuide.NightlifeFragmnet();
            }
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.title_activity_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.title_activity_resturant);
        } else if (position == 2) {
            return mContext.getString(R.string.title_activity_shopping);
        } else {
            return mContext.getString(R.string.title_activity_nightlife);
        }
    }
}
