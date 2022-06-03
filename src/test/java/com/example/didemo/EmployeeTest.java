package com.example.didemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EmployeeTest {

    @Mock
    private AddressInterface addressInterface;

    @Mock
    private Department department;

    @Test
    void getInfo_should_return_valid_data_given_valid_values_of_dep() {

        // arrange
        BDDMockito.given(addressInterface.getInfo()).willReturn("la");
        BDDMockito.given(department.getInfo()).willReturn("whatever");

        // act and assert
        Employee employee = new Employee(addressInterface, department);
        String info = employee.getInfo();
        Assertions.assertThat(info).isEqualTo("LA WHATEVER");

        // verify
        BDDMockito.verify(addressInterface).getInfo();
        BDDMockito.verify(department).getInfo();
    }
}