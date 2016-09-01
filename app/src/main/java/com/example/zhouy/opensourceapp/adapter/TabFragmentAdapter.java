package com.example.zhouy.opensourceapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * User: zhy
 * Date: 2016-09-01
 */
public class TabFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragmentList;

    private String[] fragmentTitle;

    public TabFragmentAdapter(FragmentManager fm, List<Fragment> fragments, String[] titles) {
        super(fm);
        mFragmentList = fragments;
        fragmentTitle = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
