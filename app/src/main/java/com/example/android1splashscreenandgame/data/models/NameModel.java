package com.example.android1splashscreenandgame.data.models;

import java.io.Serializable;

public class NameModel implements Serializable {
    private String name;
    private String number;
    private int image;
    String address;


    public NameModel(String name, String number, int image,String address) {
        this.name = name;
        this.number = number;
        this.image = image;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getImage() {
        return image;
    }
    public String getAddress() {
        return address;
    }

}
