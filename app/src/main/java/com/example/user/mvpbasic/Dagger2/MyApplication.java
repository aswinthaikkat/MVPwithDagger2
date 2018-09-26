package com.example.user.mvpbasic.Dagger2;

import android.app.Application;

public class MyApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApiComponent = DaggerApiComponent.builder()
                .apiModule(new ApiModule())
                .build();
    }

    public ApiComponent getNetComponent() {
        return mApiComponent;
    }
}
