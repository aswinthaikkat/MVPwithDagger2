package com.example.user.mvpbasic.Dagger2;

import com.example.user.mvpbasic.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
}