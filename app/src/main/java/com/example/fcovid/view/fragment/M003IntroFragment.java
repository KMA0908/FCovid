package com.example.fcovid.view.fragment;

import android.view.View;


import com.example.fcovid.OnActionCallBack;
import com.example.fcovid.R;
import com.example.fcovid.databinding.M003IntroFragmentBinding;
import com.example.fcovid.view.viewmodel.Intro003ViewModel;

public class M003IntroFragment extends BaseFragment<M003IntroFragmentBinding, Intro003ViewModel>{

    public static final String KEY_SHOW_INTRO_FRAGMENT = "KEY_SHOW_INTRO_FRAGMENT";
    private OnActionCallBack mCallBack;

    public void setmCallBack(OnActionCallBack mCallBack){
        this.mCallBack = mCallBack;
    }

    @Override
    protected M003IntroFragmentBinding initBinding(View mRootView) {
        return M003IntroFragmentBinding.bind(mRootView);
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
