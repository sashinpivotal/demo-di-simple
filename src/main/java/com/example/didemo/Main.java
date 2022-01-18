package com.example.didemo;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(new USAddress(), new Department());
        System.out.println(employee.getInfo());
    }
}
