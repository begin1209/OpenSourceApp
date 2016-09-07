package com.example.zhouy.opensourceapp.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import com.example.zhouy.opensourceapp.R;

/**
 * 专为ViewPager定制的滑动选项卡
 * User: zhy
 * Date: 2016-09-07
 */
public class PageSlidingTabStrip extends HorizontalScrollView {

    private boolean allowWidthFull;

    private boolean diableViewPager;

    private Drawable slidingBlockDrawable;

    private ViewGroup tabsLayout;

    private int currentPosition;

    private ViewPager viewPager;


    public PageSlidingTabStrip(Context context) {
        super(context);
    }

    public PageSlidingTabStrip(Context context, AttributeSet attrs) {
        super(context, attrs);
        setHorizontalScrollBarEnabled(false);  //隐藏横向滑动选项条
        if (null != attrs) {
            TypedArray attrsTypeArray = context.obtainStyledAttributes(attrs,
                    R.styleable.PageSlidingTabStrip);
            if (null != attrsTypeArray) {
                allowWidthFull = attrsTypeArray.getBoolean(
                        R.styleable.PageSlidingTabStrip_allowWidthFull, false);
                diableViewPager = attrsTypeArray.getBoolean(
                        R.styleable.PageSlidingTabStrip_disableViewPager, false);
                slidingBlockDrawable = attrsTypeArray.getDrawable(
                        R.styleable.PageSlidingTabStrip_slidingBlock);
                attrsTypeArray.recycle();
            }
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (!allowWidthFull) {
            return;
        }
        ViewGroup tabsLayout = getTabsLayout();
        if(null != tabsLayout){
            currentPosition = viewPager != null ? viewPager.getCurrentItem():0;
            if(!diableViewPager){
                scrollt;
            }
        }


    }

    /**
     * 获取布局
     *
     * @return
     */
    private ViewGroup getTabsLayout() {
        if (tabsLayout == null) {
            if (getChildCount() > 0) {
                tabsLayout = (ViewGroup) getChildAt(0);
            } else {
                removeAllViews();
                tabsLayout = new LinearLayout(getContext());
                addView(tabsLayout, LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
            }
        }
        return tabsLayout;
    }

    private void scrollToChild(int position, int offset){
        ViewGroup tabsView = getTabsLayout();
        if(null != tabsView && tabsView.getChildCount() > 0
                &&  position < tabsView.getChildCount()){
            View view = tabsView.getChildAt(position);
            if(null != view){
                int newScrollX = view.getLeft() + offset;
                if(position > 0 || offset > 0){
                    newScrollX -= 240 -
                }
            }
        }
    }
}
