package com.sunshuai.mosbydemo.database;

/**
 * Created by sunshuai on 2018/4/22
 */
public class DatabaseImpl implements Database {
    @Override
    public void login(String username, String password,LoginCallBack callBack) {
        if (username.equals("sun") && password.equals("sun")){
            callBack.onSuccess();
        } else {
            callBack.onFailed();
        }
    }
}
