package com.sunshuai.mosbydemo.login;

import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * Created by sunshuai on 2018/4/22
 */
public interface LoginView extends MvpView {
    void showLoading();

    void hideLoading();

    void showSuccessMsg();

    void showFailedMsg();
}

