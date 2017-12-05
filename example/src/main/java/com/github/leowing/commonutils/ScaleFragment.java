package com.github.leowing.commonutils;


import com.github.leowing.utils.AbViewUtil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * 使用 AbViewUtil 缩放布局
 */
public class ScaleFragment extends Fragment {

    public static ScaleFragment newInstance() {
        return new ScaleFragment();
    }

    public ScaleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scale, container, false);
        // 缩放 View
        AbViewUtil.scaleCompat(view);
        return view;
    }

}
