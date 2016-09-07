package com.example.zhouy.opensourceapp.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;

import com.example.zhouy.opensourceapp.R;

/**
 * User: zhy
 * Date: 2016-09-05
 */
public abstract class BaseListFragment<T> extends BaseFragment<T> implements
        SwipeRefreshLayout.OnRefreshListener {

    private ListView mListView;
    private SwipeRefreshLayout mSwipeRefreshLayout;


    @Override
    protected int getResourceId() {
        return 0;
    }

    @Override
    protected void initWidget(View view) {
        super.initWidget(view);
        mListView = (ListView)view.findViewById(R.id.swipe_list_view);
        mSwipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(R.id.swipe_refresh_layout);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.swipe_refresh_color1,
                R.color.swipe_refresh_color2,
                R.color.swipe_refresh_color3,
                R.color.swipe_refresh_color4);
    }

    @Override
    public void onRefresh() {

    }


}
