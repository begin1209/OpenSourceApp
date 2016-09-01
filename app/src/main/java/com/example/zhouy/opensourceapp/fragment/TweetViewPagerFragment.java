package com.example.zhouy.opensourceapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhouy.opensourceapp.R;

/**
 * User: zhy
 * Date: 2016-08-31
 */
public class TweetViewPagerFragment extends BaseViewPagerFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tweet_fragment,container,false);
    }
}
