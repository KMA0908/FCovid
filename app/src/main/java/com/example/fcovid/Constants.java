package com.example.fcovid;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Constants {
    private static final String FILE_NAME = "file_shared";
    private static Constants instance;
    private Constants() {
        //for singleton
    }
    public boolean isInternetAvailable() {
        ConnectivityManager cm  = (ConnectivityManager) FCovidApp.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfor = cm.getActiveNetworkInfo();
        return networkInfor != null && networkInfor.isConnectedOrConnecting();
    }
    public static Constants getInstance(){
        if(instance==null){
            instance = new Constants();
        }
        return instance;
    }
    public boolean isExistPref(String key) {
        SharedPreferences pref=FCovidApp.getInstance().getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return pref.contains(key);
    }

    public void savePref(String key, String value) {
        SharedPreferences pref=FCovidApp.getInstance().getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        pref.edit().putString(key,value).apply();
    }

    public String getPref(String key) {
        SharedPreferences pref=FCovidApp.getInstance().getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        return pref.getString(key,null);
    }

    public void clearPref(String key) {
        SharedPreferences pref = FCovidApp.getInstance()
                .getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        pref.edit().remove(key).apply();
    }

}
