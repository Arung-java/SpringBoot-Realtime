package com.ashok.arralist.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, 1000, "Chandra Shekhar", 6000),
				new Employee(1, 1000, "Rajesh", 8000), new Employee(1, 1004, "Rahul", 9000),
				new Employee(1, 1001, "Suresh", 12000), new Employee(1, 1004, "Satosh", 8500));
		
		List<Integer> d=employees.stream().map(salary->salary.getSalary()).collect(Collectors.toList());
		System.out.println(d);
	}
}
