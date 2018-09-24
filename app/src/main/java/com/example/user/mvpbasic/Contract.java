package com.example.user.mvpbasic;

public interface Contract {
    interface View{
         void showTheMessage(String msg);
    }

    interface Model{
         void setNames(String firstName,String lastName);
         String getTheMessage();
    }

    interface Presenter{
         void setView(Contract.View view);
         void loadTheMessage();
         void submitNames(String firstName,String lastName);
    }
}
