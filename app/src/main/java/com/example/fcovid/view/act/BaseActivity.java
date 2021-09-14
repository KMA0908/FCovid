package com.example.fcovid.view.act;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.fcovid.OnActionCallBack;
import com.example.fcovid.R;

public abstract class BaseActivity<BD extends ViewDataBinding,VM extends ViewModel> extends AppCompatActivity
        implements View.OnClickListener , OnActionCallBack {

    protected BD binding;
    protected VM viewModel;

    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = LayoutInflater.from(this).inflate(getLayoutId(), null);
        viewModel = new ViewModelProvider(this).get(getViewModelClass());
        setContentView(rootView);
        binding = initBinding(rootView);
        initViews();
    }

    protected abstract Class<VM> getViewModelClass();

    protected abstract BD initBinding(View rootView);

    protected abstract void initViews();

    protected abstract int getLayoutId();

    @Override
    public void onClick(View v) {
        //do nothing
    }

    protected void showFragment(int layoutID, Fragment fragment, boolean addToBackStack){

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container_view,fragment);
        if(addToBackStack){
            transaction.addToBackStack("add");
        }
        transaction.commit();
    }
}
