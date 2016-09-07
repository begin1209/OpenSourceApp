package com.example.zhouy.opensourceapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.RequestManager;

import butterknife.ButterKnife;

/**
 * User: zhy
 * Date: 2016-09-05
 */
public abstract class BaseFragment<T> extends Fragment{

    protected View mRoot;

    protected RequestManager mRequestManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(null != mRoot){
            ViewGroup parent = (ViewGroup) mRoot.getParent();
            if(null != parent){
                parent.removeView(mRoot);
            }
        }else {
            mRoot = inflater.inflate(getResourceId(),container,false);
            ButterKnife.bind(this.mRoot);
            if(null != savedInstanceState){
                onRestartInstance(savedInstanceState);
            }
            initWidget(mRoot);
            initData();
        }
        return mRoot;
    }

    protected abstract int getResourceId();

    protected void onRestartInstance(Bundle bundle){

    }

    protected void initWidget(View view){

    }

    protected void initData(){

    }
}
