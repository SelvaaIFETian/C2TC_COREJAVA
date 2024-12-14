package com.selvaganapathy.assignment1.employees;

public class employee {
	/**
	 * Represents an employee with basic details such as name, ID, and salary.
	 */
	    private String name;
	    private int employeeId;
	    private double salary;

	    public employee(String name2, int employeeId2, double salary2) {
			// TODO Auto-generated constructor stub
		}

		// Constructor
	    public void Employees(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getter and Setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for employeeId
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    // Getter and Setter for salary
	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}
