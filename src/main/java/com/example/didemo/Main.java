package com.example.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class);
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee.getInfo());
    }

    @Bean
    public AddressInterface addressInterface() {
        return new USAddress();
    }

    @Bean
    public Department department() {
        return new Department();
    }

    @Bean
    public Employee employee(AddressInterface addressInterface, Department department) {
        Employee employee = new Employee(addressInterface, department);
        return employee;
    }
}
