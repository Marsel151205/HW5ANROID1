package com.example.android1splashscreenandgame.data.models;

import java.io.Serializable;

public class NameModel implements Serializable {
    private String name;
    private String number;
    private String address;
    private String description;

    public NameModel(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }
}
