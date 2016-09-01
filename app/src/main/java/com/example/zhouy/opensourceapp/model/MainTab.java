package com.example.zhouy.opensourceapp.model;

import com.example.zhouy.opensourceapp.R;
import com.example.zhouy.opensourceapp.fragment.DiscoverViewPagerFragment;
import com.example.zhouy.opensourceapp.fragment.MyInformationFragment;
import com.example.zhouy.opensourceapp.fragment.TogetherViewPagerFragment;
import com.example.zhouy.opensourceapp.fragment.TweetViewPagerFragment;

/**
 * User: zhy
 * Date: 2016-08-31
 */
public enum MainTab {

    NEWS(0, R.string.together_page_title,
            R.drawable.bottom_together_sector,TogetherViewPagerFragment.class),
    TWEET(1,R.string.tweet_page_title,
            R.drawable.bottom_tweet_selector, TweetViewPagerFragment.class),
    QUICK(2,R.string.main_tab_name_quick,
            R.drawable.bottom_add_selector,null),
    DISCOVER(3,R.string.discover_page_title,
            R.drawable.bottom_discover_selector, DiscoverViewPagerFragment.class),
    ME(4,R.string.my_page_title,R.drawable.bottom_my_selector, MyInformationFragment.class);

    private int index;
    private int resourceName;
    private int resourceIcon;
    private Class<?> classZ;

    private MainTab(int index, int resName, int resIcon, Class<?> classZ){
        this.index = index;
        this.resourceName = resName;
        this.resourceIcon = resIcon;
        this.classZ = classZ;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getResourceName() {
        return resourceName;
    }

    public void setResourceName(int resourceName) {
        this.resourceName = resourceName;
    }

    public int getResourceIcon() {
        return resourceIcon;
    }

    public void setResourceIcon(int resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    public Class<?> getClassZ() {
        return classZ;
    }

    public void setClassZ(Class<?> classZ) {
        this.classZ = classZ;
    }
}
