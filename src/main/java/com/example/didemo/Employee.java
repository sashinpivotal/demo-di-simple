package com.example.didemo;

public class Employee {

    private AddressInterface address;
    private Department department;

    public Employee(AddressInterface address, Department department) {
        this.address = address;
        this.department = department;
    }

    public String getInfo() {
        String info = this.address.getInfo() + " " + this.department.getInfo();
        return info.toUpperCase();
    }

}
