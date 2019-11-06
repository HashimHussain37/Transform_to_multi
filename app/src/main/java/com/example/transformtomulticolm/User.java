package com.example.transformtomulticolm;

/**
 * Created by Mitch on 2016-05-13.
 */
public class User {
    private String Name;
    private String Phone;
    private String Email;
    private String Street;

    public User(String name, String phone, String email , String street){
        Name = name;
        Phone = phone;
        Email = email;
        Street = street;
    }

    public String getName() {
        return Name;
    }

    public void setfName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

}
