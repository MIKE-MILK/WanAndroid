package com.mredrock.gankio.presenter;

import android.os.Handler;
import android.os.Message;

import com.mredrock.gankio.base.BasePresenter;
import com.mredrock.gankio.contract.MainContract;
import com.mredrock.gankio.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.Model, MainContract.View> implements MainContract.Presenter {

    public MainPresenter(MainContract.View view) {
        super(view);
    }

    @Override
    public MainContract.Model initModel(Handler handler) {
        return new MainModel(handler);
    }

    @Override
    public void modelResponse(Message msg) {

    }
}
