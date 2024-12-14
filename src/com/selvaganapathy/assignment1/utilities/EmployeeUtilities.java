package com.selvaganapathy.assignment1.utilities;

import com.selvaganapathy.assignment1.employees.employee;

public class EmployeeUtilities {
	    public void printEmployeeDetails(employee employee) {
	        System.out.println("Employee Details:");
	        System.out.println("Name:  " + employee.getName());
	        System.out.println("ID:  " + employee.getEmployeeId());
	        System.out.println("Salary:  " + employee.getSalary());
	    }
	}