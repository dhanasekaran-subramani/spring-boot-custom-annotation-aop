package com.ds.tutorials.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployeeDetails()
    {
        return employeeDAO.fetchEmployeeDetails();
    }
}
