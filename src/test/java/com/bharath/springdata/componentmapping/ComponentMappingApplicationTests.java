package com.bharath.springdata.componentmapping;

import com.bharath.springdata.componentmapping.entities.Address;
import com.bharath.springdata.componentmapping.entities.Employee;
import com.bharath.springdata.componentmapping.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentMappingApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateEmployee(){
        Employee employee = Employee.builder()
                .id(123).name("Bhrath")
                .address(Address.builder()
                        .city("Austin")
                        .streetaddress("Spicewood Springs")
                        .country("USA")
                        .state("TEXAS")
                        .zipCode("78750")
                        .build())
                .build();
        employeeRepository.save(employee);
    }

}
