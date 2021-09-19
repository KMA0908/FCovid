package com.example.fcovid.view.act;

import android.view.View;

import com.example.fcovid.OnActionCallBack;
import com.example.fcovid.R;
import com.example.fcovid.databinding.ActivityMainBinding;
import com.example.fcovid.view.fragment.M003IntroFragment;
import com.example.fcovid.view.fragment.M004IntroFragment;
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
        switch (key) {
            case M003IntroFragment.KEY_SHOW_INTRO_FRAGMENT:
                M004IntroFragment introFragment = new M004IntroFragment();
                introFragment.setCallBack(this);
                showFragment(R.id.container_view, introFragment, false);
                break;
        }
    }

}