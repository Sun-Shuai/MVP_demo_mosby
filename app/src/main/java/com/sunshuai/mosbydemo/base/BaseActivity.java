package com.sunshuai.mosbydemo.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by sunshuai on 2018/4/23
 */
public abstract class BaseActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> {

    protected Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        initVariable();
        initView();
        loadData();
    }

    @Override
    public void setContentView(int layoutResId) {
        super.setContentView(layoutResId);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }


    protected abstract int getLayoutId();


    protected void initVariable() {
    }


    protected void initView() {
    }


    protected void loadData() {
    }

}