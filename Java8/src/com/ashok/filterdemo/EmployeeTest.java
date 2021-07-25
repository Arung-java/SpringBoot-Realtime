package com.ashok.filterdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Robert", 35, "Manager"));
		empList.add(new Employee(2, "Martin", 35, "General Manager"));
		empList.add(new Employee(3, "Jack", 25, "Manager"));
		empList.add(new Employee(4, "Akshay", 20, "Developer"));
		empList.add(new Employee(5, "Arvind", 40, "Manager"));
		empList.add(new Employee(6, "Dinesh", 45, "Manager"));

//		for (Employee employee : empList) {
//			System.out.println(employee);
//		}

		// List<Integer> list = empList.stream().filter(e -> e.getAge() > 24).map(e ->
		// e.getAge())
		// .collect(Collectors.toList());
//		for (Integer employee : list) {
//			System.out.println(employee);
//		}
		// System.out.println(list);

		List<String> desigList = empList.stream().map(e -> e.getDesignation()).collect(Collectors.toList());
		for (String string : desigList) {
			System.out.println(string);
		}

//		List<String> namesOfEmps = empList.stream().map(e -> e.getName())
//				.collect(Collectors.toList());
//		System.out.println(namesOfEmps);

	}
}
