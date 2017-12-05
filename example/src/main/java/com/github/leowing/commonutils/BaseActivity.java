package com.github.leowing.commonutils;

import com.github.leowing.utils.AbViewUtil;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author liuweiping
 * @since 2017/12/1.
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * 使用 {@link AbViewUtil} 处理
     *
     * @see android.app.Activity#setContentView(int)
     */
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View root = inflater.inflate(layoutResID, null);
        setContentView(root);
    }

    /**
     * 使用 {@link AbViewUtil} 处理
     *
     * @see android.app.Activity#setContentView(View)
     */
    @Override
    public void setContentView(@NonNull View view) {
        super.setContentView(view);
        AbViewUtil.scaleCompat(view);
    }

    /**
     * 使用 {@link AbViewUtil} 处理
     *
     * @see android.app.Activity#setContentView(View, ViewGroup.LayoutParams)
     */
    @Override
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        AbViewUtil.scaleCompat(view);
    }

    /**
     * 使用 {@link AbViewUtil} 处理
     *
     * @see android.app.Activity#addContentView(View, ViewGroup.LayoutParams)
     */
    @Override
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
        AbViewUtil.scaleCompat(view);
    }
}
