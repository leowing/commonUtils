package com.github.leowing.commonutils;

import com.github.leowing.utils.AbViewUtil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

/**
 * 使用 AbViewUtil 缩放布局
 */
public class ScaleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text:
                Intent intent = new Intent(getApplicationContext(), Scale02Activity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载布局
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_main, null);

        ////////////////////////////////////////
        // 关键代码：缩放
        ////////////////////////////////////////
        AbViewUtil.scaleCompat(view);

        // 设置 ContentView
        setContentView(view);
        // 此时，展示出的布局尺寸即为缩放后的

        // 加载 Fragment
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, ScaleFragment.newInstance());
        transaction.commit();

        // 第二个界面入口
        findViewById(R.id.text).setOnClickListener(this);
    }
}
