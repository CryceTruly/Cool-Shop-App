package com.crycetruly.thecoolshop.models;

/**
 * Created by Elia on 10/07/2018.
 */

public class User {
    private String name,phone,address,bd;


    public User() {
    }

    public User(String name, String phone, String address, String bd) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", bd='" + bd + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }
}
