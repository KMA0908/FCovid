package com.example.fcovid;

import android.app.Application;

public class FCovidApp extends Application {
    private static final String TAG = FCovidApp.class.getName();
    private static FCovidApp instance;

    public static FCovidApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

}
