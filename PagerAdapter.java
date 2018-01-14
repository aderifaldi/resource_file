package com.ar.simplecommerce.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ar.simplecommerce.view.fragment.EmptyFragment;

/**
 * Created by aderifaldi on 14/09/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private CharSequence Titles[];
    private int numOfTabs;
    private EmptyFragment news;
    private EmptyFragment event;

    public PagerAdapter(FragmentManager fm, CharSequence mTitles[],
                                    int numOfTabs,
                                    EmptyFragment news,
                                    EmptyFragment event) {
        super(fm);
        this.numOfTabs = numOfTabs;

        this.event = event;
        this.news = news;

        this.Titles = mTitles;

    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return news;
        }else {
            return event;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
