package com.ds.tutorials.annotation;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController extends  AbstractController {

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private EmployeeService employeeService;

    @Authorization
    @GetMapping (path = "/employee", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse<List<Employee>>> getAllEmployeeDetails()
    {
        List<Employee> employeeList = employeeService.getAllEmployeeDetails();

        return generateResponse(employeeList);
    }

    @GetMapping(path = "/hello",produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public String hello()
    {
        return "Hello World ! How are you Today!";
    }


    @CustomAnnotation
    @GetMapping(path = "/key",produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public String customAnnotation()
    {
        return "Hello World ! How are you Today!";
    }
}
