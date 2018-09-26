package com.example.user.mvpbasic.Dagger2;

import com.example.user.mvpbasic.Contract;
import com.example.user.mvpbasic.DataManager;
import com.example.user.mvpbasic.Ipresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {


    @Provides
    @Singleton
    public Contract.Model getContactModel(){
        Contract.Model model = new DataManager();
        return  model;

    }

    @Provides
    @Singleton
    public Contract.Presenter getContactPresenter(Contract.Model mModel){

        Contract.Presenter presenter = new Ipresenter(mModel);
        return presenter;

    }
}
