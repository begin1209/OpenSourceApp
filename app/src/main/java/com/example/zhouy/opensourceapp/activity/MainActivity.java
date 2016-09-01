package com.example.zhouy.opensourceapp.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.zhouy.opensourceapp.R;
import com.example.zhouy.opensourceapp.log.LogUtil;
import com.example.zhouy.opensourceapp.model.MainTab;

public class MainActivity extends AppCompatActivity implements TabHost.OnTabChangeListener{


    private String mTitle;

    private String[] mTitles;

    private FragmentTabHost mMainTabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews() {
        mTitle = getResources().getString(R.string.together_page_title);
        mTitles = getResources().getStringArray(R.array.main_page_title);
        mMainTabHost = (FragmentTabHost) findViewById(R.id.main_fragment_tabhost);
        mMainTabHost.setup(this, getSupportFragmentManager(), R.id.main_framelayout);
        initTabs();
    }

    private void initTabs() {
        MainTab[] mainTabs = MainTab.values();
        for (int i = 0; i < mainTabs.length; i++) {
            MainTab tab = mainTabs[i];
            View view = View.inflate(this, R.layout.tab_indicator, null);
            TextView textView = (TextView) view.findViewById(R.id.tab_text_view);
            ImageView imageView = (ImageView) view.findViewById(R.id.tab_icon_view);
            textView.setText(tab.getResourceName());
            imageView.setImageResource(tab.getResourceIcon());
            TabHost.TabSpec tabLayoutTab = mMainTabHost.newTabSpec(tab.getResourceName()+"");
            if (i == 2) {
                view.setVisibility(View.INVISIBLE);
            }
            tabLayoutTab.setIndicator(view);
            mMainTabHost.addTab(tabLayoutTab,tab.getClassZ(),null);
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
    public void onTabChanged(String s) {
        
    }
}
