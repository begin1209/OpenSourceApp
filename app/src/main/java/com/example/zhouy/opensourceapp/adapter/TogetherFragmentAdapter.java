package com.example.zhouy.opensourceapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.List;

/**
 * Created by zhouy on 2016/9/2.
 */
public class TogetherFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragmentList;

    public TogetherFragmentAdapter(FragmentManager fm, List<Fragment> lists) {
        super(fm);
        mFragmentList = lists;
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
