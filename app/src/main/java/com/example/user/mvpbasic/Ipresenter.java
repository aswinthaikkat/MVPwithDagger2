package com.example.user.mvpbasic;

public class Ipresenter implements Contract.Presenter {
    private  Contract.View view;
    private  Contract.Model model;
    @Override
    public void setView(Contract.View view) {
    this.view = view;
    model = new DataManager();
    }

    @Override
    public void loadTheMessage() {
        view.showTheMessage(model.getTheMessage());

    }

    @Override
    public void submitNames(String firstName, String lastName) {

    model.setNames(firstName,lastName);

    }
}
