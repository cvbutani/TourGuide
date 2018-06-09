package com.example.chirag.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.chirag.tourguide.MontrealGuide.AttractionsFragment;

import com.example.chirag.tourguide.MontrealGuide.ResturantFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PageAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0){
            return new AttractionsFragment();
        } else {
            return new ResturantFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position ==0) {
            return mContext.getString(R.string.title_activity_attractions);
        } else {
            return mContext.getString(R.string.title_activity_resturant);
        }
    }
}
