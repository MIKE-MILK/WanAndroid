package com.mredrock.gankio.uitls.httphelper;

public interface CallBack {

    void onResponse(String response);

    void onFailed(Exception e);
}
