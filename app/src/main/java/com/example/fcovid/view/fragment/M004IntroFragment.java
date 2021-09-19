package com.example.fcovid.view.fragment;

import android.view.View;
import com.example.fcovid.R;
import com.example.fcovid.databinding.M003IntroFragmentBinding;
import com.example.fcovid.view.viewmodel.Intro004ViewModel;

public class M004IntroFragment extends BaseFragment<M003IntroFragmentBinding, Intro004ViewModel>{

    @Override
    protected M003IntroFragmentBinding initBinding(View mRootView) {
        return M003IntroFragmentBinding.bind(mRootView);
    }

    @Override
    protected Class<Intro004ViewModel> getViewModelClass() {
        return Intro004ViewModel.class;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.m004_intro_fragment;
    }

    @Override
    protected void initViews() {

    }
}
