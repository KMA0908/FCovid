package com.example.fcovid.view.fragment;

import android.view.View;


import com.example.fcovid.OnActionCallBack;
import com.example.fcovid.R;
import com.example.fcovid.view.viewmodel.Intro003ViewModel;

public class IntroFragment003 extends BaseFragment<IntroFragment003Binding, Intro003ViewModel>{

    public static final String KEY_SHOW_INTRO_FRAGMENT = "KEY_SHOW_INTRO_FRAGMENT";
    private OnActionCallBack mCallBack;

    public void setmCallBack(OnActionCallBack mCallBack){
        this.mCallBack = mCallBack;
    }

    @Override
    protected IntroFragment003Binding initBinding(View mRootView) {
        return IntroFragment003Binding.bind(mRootView);
    }

    @Override
    protected Class<Intro003ViewModel> getViewModelClass() {
        return Intro003ViewModel.class;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.m003_intro_fragment;
    }

    @Override
    protected void initViews() {

    }
}
