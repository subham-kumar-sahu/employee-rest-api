package com.employee.employeerestapi.repository;

import org.springframework.stereotype.Repository;

import com.employee.employeerestapi.model.Employee;
import com.employee.employeerestapi.model.Employees;

@Repository
public class EmployeeDAO {

	private static Employees list = new Employees();

	static {
		list.getEmployeeList().add(new Employee(1, "Shankar", "Gupta", "shankar.gupta@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Hari", "Kolenchiskey", "hari.kolenchiskey@gmail.com"));
		list.getEmployeeList().add(new Employee(3, "David", "Kameron", "david.kameron@gmail.com"));
	}

	public Employees getAllEmployees() {
		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
