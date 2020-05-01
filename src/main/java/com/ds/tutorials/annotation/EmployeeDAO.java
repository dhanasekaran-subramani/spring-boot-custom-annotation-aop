package com.ds.tutorials.annotation;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAO {

    public List<Employee> fetchEmployeeDetails() {
    return populate();
    }


    private List<Employee> populate() {

        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee1 = new Employee(1, "AAAAAAAAAA", new BigDecimal(20000));
        Employee employee2 = new Employee(2, "BBBBBBBBBB", new BigDecimal(30000));
        Employee employee3 = new Employee(3, "CCCCCCCCCC", new BigDecimal(40000));
        Employee employee4 = new Employee(4, "DDDDDDDDDD", new BigDecimal(50000));
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        return employeeList;
    }
}
