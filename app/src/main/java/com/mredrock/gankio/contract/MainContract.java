package com.mredrock.gankio.contract;

import com.mredrock.gankio.base.IModel;
import com.mredrock.gankio.base.IPresenter;
import com.mredrock.gankio.base.IView;

public interface MainContract {
    interface Model extends IModel{
        // 特有的方法
    }

    interface View extends IView{
        // 特有的方法
    }

    interface Presenter extends IPresenter {
        // 特有的方法
    }
}
