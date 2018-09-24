package com.example.user.mvpbasic;

public class DataManager implements Contract.Model {
   private Person person;
    @Override
    public void setNames(String firstName, String lastName) {
         person = new Person(firstName,lastName);

    }

    @Override
    public String getTheMessage() {
        return "You have entered " + person.getFirstname()+ " " + person.getLastname();
    }
}
