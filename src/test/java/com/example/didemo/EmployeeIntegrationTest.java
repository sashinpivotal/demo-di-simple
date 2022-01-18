package com.example.didemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeIntegrationTest {

    @Test
    void getInfo_should_return_valid_info() {

        Employee employee = new Employee(new USAddress(), new Department());
        String info = employee.getInfo();
        Assertions.assertThat(info).isEqualTo("BOSTON ENGINEERING");
    }
}