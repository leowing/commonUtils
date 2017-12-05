package com.github.leowing.commonutils;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * 使用 AbViewUtil 缩放布局
 */
public class Scale02Fragment extends BaseFragment {

    public static Scale02Fragment newInstance() {
        return new Scale02Fragment();
    }

    public Scale02Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 不使用 LayoutInflater 加载布局，而是使用 BaseFragment 中封装的 getContentView()
        return getContentView(inflater, container, R.layout.fragment_scale);
    }

}
