package com.selvaganapathy.assignment1.utilities;

public class AssignmentMain {
	 public static void main(String[] args) {
	        com.selvaganapathy.assignment1.employees.Manager manager =
	                new com.selvaganapathy.assignment1.employees.Manager("Alice", 101, 75000, "HR");
	        com.selvaganapathy.assignment1.employees.Developer developer =
	                new com.selvaganapathy.assignment1.employees.Developer("Bob", 102, 80000, "Java");
	        com.selvaganapathy.assignment1.utilities.EmployeeUtilities utilities = new com.selvaganapathy.assignment1.utilities.EmployeeUtilities();
	        utilities.printEmployeeDetails(manager);
	        utilities.printEmployeeDetails(developer);
	    }
	}

