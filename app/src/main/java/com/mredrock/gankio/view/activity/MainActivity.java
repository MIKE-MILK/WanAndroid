package com.mredrock.gankio.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mredrock.gankio.R;
import com.mredrock.gankio.base.BaseActivity;
import com.mredrock.gankio.base.IView;
import com.mredrock.gankio.contract.MainContract;
import com.mredrock.gankio.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
