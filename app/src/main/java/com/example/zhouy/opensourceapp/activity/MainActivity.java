package com.example.zhouy.opensourceapp.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhouy.opensourceapp.R;
import com.example.zhouy.opensourceapp.log.LogUtil;
import com.example.zhouy.opensourceapp.model.MainTab;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout mMainFrameLayout;

    private ImageView mTogether;

    private ImageView mTweetView;

    private ImageView mAddImageView;

    private ImageView mDiscoverView;

    private TextView mTextView;

    private String mTitle;

    private String[] mTitles;

    private TabLayout mMainTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDatas();

    }

    private void initDatas() {
        mTitle = getResources().getString(R.string.together_page_title);
        mTitles = getResources().getStringArray(R.array.main_page_title);
    }

    private void initViews() {
        mMainTabLayout = (TabLayout) findViewById(R.id.top_tab_layout);
        initTabs();

    }

    private void initTabs(){
        MainTab[] mainTabs = MainTab.values();
        for (int i = 0; i < mainTabs.length; i++) {
            MainTab tab = mainTabs[i];
            View view = View.inflate(this,R.layout.tab_indicator,null);
            TextView textView = (TextView)view.findViewById(R.id.tab_text_view);
            ImageView imageView = (ImageView)view.findViewById(R.id.tab_icon_view);
            textView.setText(tab.getResourceName());
            imageView.setImageResource(tab.getResourceIcon());
            if(i == 2){
                view.setVisibility(View.INVISIBLE);
            }
            TabLayout.Tab tabLayoutTab = mMainTabLayout.newTab().setCustomView(view);
            mMainTabLayout.addTab(tabLayoutTab);
            mMainTabLayout.setTabMode(TabLayout.GRAVITY_CENTER);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.search_menu, menu);
        restoreActionBar();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    //利用ActionBar显示
    private void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (null != actionBar) {
            LogUtil.log("显示ActionBar");
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setTitle(mTitle);
            actionBar.show();
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }
    }
}
