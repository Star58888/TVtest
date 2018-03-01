package com.example.admin.tvtest;

import android.os.Bundle;
import android.provider.Browser;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BrowseFragment;
import android.util.Log;

/**
 * Created by admin on 2018/3/1.
 */

public class MainFragment extends BrowseFragment {
    private static final String TAG = MainFragment.class.getSimpleName();
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(TAG ,"onActivityCreated");
        super.onActivityCreated(savedInstanceState);
        setupUIElements();
    }

    private void setupUIElements() {
//        setBadgeDrawable(getActivity()
//                .getResources()
//                .getDrawable(R.drawable.app_icon_your_company));//展示在标题栏上的图片(图片会隐藏标题)

        setTitle("Hello Android TV");
        //HEADERS_ENABLED 显示左侧导航栏，HEADERS_DISABLED 不显示 HEADERS_HIDDEN 隐藏，到边缘按左键还能显示
        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);

        // 设置快速导航（或 headers) 背景色
        setBrandColor(getResources().getColor(R.color.fastlane_background));
        // 设置搜索的颜色
        setSearchAffordanceColor(getResources().getColor(R.color.search_opaque));
    }
}
