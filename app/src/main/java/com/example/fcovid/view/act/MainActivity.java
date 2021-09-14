package com.example.fcovid.view.act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.fcovid.OnActionCallBack;
import com.example.fcovid.R;
import com.example.fcovid.databinding.ActivityMainBinding;
import com.example.fcovid.view.viewmodel.MainViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> implements OnActionCallBack {

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    protected ActivityMainBinding initBinding(View rootView) {
        return ActivityMainBinding.bind(rootView);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void callBack(String key, Object data) {

    }
}