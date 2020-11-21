package com.employee.employeerestapi.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.employee.employeerestapi.model.Employee;
import com.employee.employeerestapi.model.Employees;
import com.employee.employeerestapi.repository.EmployeeDAO;

@RequestMapping("/hello")
@RestController
public class EmployeeController {

	@GetMapping
    public String hello() {
        return "Hello TechPrimers";
    }
}
