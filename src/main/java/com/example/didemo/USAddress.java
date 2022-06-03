package com.example.didemo;

public class USAddress implements AddressInterface {

    private String city = "boston";

    @Override
    public String getInfo() {
        return city;
    }
}
