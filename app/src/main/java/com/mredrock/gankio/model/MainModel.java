package com.mredrock.gankio.model;

import android.os.Handler;

import com.mredrock.gankio.base.BaseModel;
import com.mredrock.gankio.contract.MainContract;

public class MainModel extends BaseModel implements MainContract.Model {

    public MainModel(Handler handler) {
        super(handler);
    }
}
