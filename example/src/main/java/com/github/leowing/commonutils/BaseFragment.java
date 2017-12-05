package com.github.leowing.commonutils;


import com.github.leowing.utils.AbViewUtil;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * 使用 AbViewUtil 缩放布局
 */
public abstract class BaseFragment extends Fragment {

    /**
     * 使用 {@link AbViewUtil} 处理缩放
     */
    protected View getContentView(LayoutInflater inflater, @Nullable ViewGroup container, int layoutId) {
        View view = inflater.inflate(layoutId, container, false);
        AbViewUtil.scaleCompat(view);
        return view;
    }

}
