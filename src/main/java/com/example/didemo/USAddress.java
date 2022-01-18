package com.example.didemo;

public class USAddress implements AddressInterface {

    private String city = "Boston";

    @Override
    public String getInfo() {
        return city;
    }
}
