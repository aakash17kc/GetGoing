package com.grooveon.getgoing;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AppActivity extends AppCompatActivity implements AttractionsFragment.OnFragmentInteractionListener,
        RestaurantsFragment.OnFragmentInteractionListener,EventsFragment.OnFragmentInteractionListener,PlacesFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);

        //Creating Tabs for PagerAdapter
        tabLayout.addTab(tabLayout.newTab().setText(getText(R.string.attract)));
        tabLayout.addTab(tabLayout.newTab().setText(getText(R.string.events)));
        tabLayout.addTab(tabLayout.newTab().setText(getText(R.string.restaurants)));
        tabLayout.addTab(tabLayout.newTab().setText(getText(R.string.place)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        //implements the interface of all fragments's onFragmentInteractionListener
        //not an unused method
        //required to be implemented as it's an abstract method of onFragmentInteractionListener
        //without it , the onFragmentInteractionListener cannot be implemented in the AppActivity class and the fragments won't work

    }
}

