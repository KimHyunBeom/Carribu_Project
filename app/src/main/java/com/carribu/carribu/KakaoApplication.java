package com.carribu.carribu;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "27af34288a641e81fc9401ae3081fd34");
    }
}
