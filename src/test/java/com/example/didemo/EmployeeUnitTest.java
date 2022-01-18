package com.example.didemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmployeeUnitTest {

    // Mock dependencies
    @Mock
    private AddressInterface addressInterface;

    @Mock
    private Department department;

    @Test
    void getInfo_should_return_valid_data_given_valid_address_and_dept() {

        // arrange
        given(addressInterface.getInfo()).willReturn("la");
        given(department.getInfo()).willReturn("marketing");

        // act and assert
        Employee employee = new Employee(addressInterface, department);
        Assertions.assertThat(employee.getInfo()).isEqualTo("LA MARKETING");

        // verify
        verify(addressInterface).getInfo();
        verify(department).getInfo();
    }
}
