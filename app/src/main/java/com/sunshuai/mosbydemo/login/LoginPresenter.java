package com.sunshuai.mosbydemo.login;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.sunshuai.mosbydemo.database.Database;
import com.sunshuai.mosbydemo.database.DatabaseImpl;

/**
 * Created by sunshuai on 2018/4/22
 */
public class LoginPresenter extends MvpBasePresenter<LoginView> {

    public void login(String username, String password) {
        getView().showLoading();
        Database database = new DatabaseImpl();
        database.login(username, password, new Database.LoginCallBack() {
            @Override
            public void onSuccess() {
                getView().hideLoading();
                getView().showSuccessMsg();
            }

            @Override
            public void onFailed() {
                getView().hideLoading();
                getView().showFailedMsg();
            }
        });
    }
}
