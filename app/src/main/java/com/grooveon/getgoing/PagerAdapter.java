package com.grooveon.getgoing;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int mNoOfTabs) {
        super(fm);
        this.mNoOfTabs = mNoOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AttractionsFragment att = new AttractionsFragment();
                return att;
            case 1:
                EventsFragment events = new EventsFragment();
                return events;

            case 2:
                RestaurantsFragment rest = new RestaurantsFragment();
                return rest;
            case 3:
                PlacesFragment places = new PlacesFragment();
                return places;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
