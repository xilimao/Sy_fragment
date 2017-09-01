package com.example.sxhs.sy_fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sxhs on 2017/9/1.
 */

public class TableAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TableAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OneFragment();
        } else if (position == 1) {
            return new TwoFragment();
        } else {
            return new ThreeFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "One";
        } else if (position == 1) {
            return "Two";
        } else {
            return "Three";
        }
    }
}
