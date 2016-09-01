package com.example.zhouy.opensourceapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhouy.opensourceapp.R;
import com.example.zhouy.opensourceapp.adapter.TogetherFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * User: zhy
 * Date: 2016-08-31
 */
public class TogetherViewPagerFragment extends BaseViewPagerFragment {

    private ViewPager mTogetherViewPager;

    private TabLayout mTogetherTabLayout;

    private TogetherFragmentAdapter mTogetherFragmentAdapter;

    private List<Fragment> mFragmentLists = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.together_fragment,container,false);
        mTogetherViewPager = (ViewPager)view.findViewById(R.id.together_page_view_pager);
        mFragmentLists.add(new NewsFragment());
        mFragmentLists.add(new NewsFragment());
        mFragmentLists.add(new NewsFragment());
        mFragmentLists.add(new NewsFragment());
        mTogetherFragmentAdapter = new TogetherFragmentAdapter(getActivity().getSupportFragmentManager(),
                mFragmentLists);
        mTogetherViewPager.setAdapter(mTogetherFragmentAdapter);
        mTogetherTabLayout = (TabLayout)view.findViewById(R.id.together_page_tab);
        mTogetherTabLayout.addTab(mTogetherTabLayout.newTab().setText("资讯"));
        mTogetherTabLayout.addTab(mTogetherTabLayout.newTab().setText("博客"));
        mTogetherTabLayout.addTab(mTogetherTabLayout.newTab().setText("问答"));
        mTogetherTabLayout.addTab(mTogetherTabLayout.newTab().setText("活动"));
        mTogetherTabLayout.setupWithViewPager(mTogetherViewPager);
        mTogetherTabLayout.getTabAt(0).setText("资讯");
        mTogetherTabLayout.getTabAt(1).setText("博客");
        mTogetherTabLayout.getTabAt(2).setText("问答");
        mTogetherTabLayout.getTabAt(3).setText("活动");
        return view;
    }
}
