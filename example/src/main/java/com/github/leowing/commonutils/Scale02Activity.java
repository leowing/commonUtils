package com.github.leowing.commonutils;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * 继承 BaseActivity ，则不需要额外调用 AbViewUtils.
 */
public class Scale02Activity extends BaseActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text:
                finish();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ////////////////////////////////////////
        // 关键代码：缩放
        ////////////////////////////////////////
        setContentView(R.layout.activity_main);


        // 加载 Fragment
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, Scale02Fragment.newInstance());
        transaction.commit();

        // 点击事件，关闭当前页面
        findViewById(R.id.text).setOnClickListener(this);
    }
}
