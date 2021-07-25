package com.ashok.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetListOfEmployees {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(21, "Ashok", Arrays.asList("Chennai", "Bangalore"));
		Employee e2 = new Employee(22, "Akash", Arrays.asList("Kolkata", "Mysore"));
		Employee e3 = new Employee(23, "Anvesh", Arrays.asList("Indore", "Bhopal"));
		Employee e4 = new Employee(24, "Karan", Arrays.asList("Vizag", "Amalapuram"));

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
//		for (Employee employee : empList) {
//			System.out.println(employee);
//		}

		List<List<String>> employeecities = empList.stream().map(e -> e.getListOfCities()).collect(Collectors.toList());
		System.out.println(employeecities);

		List<String> empName = empList.stream().map(e -> e.getName()).filter(s -> s.startsWith("K"))
				.collect(Collectors.toList());
		System.out.println(empName);

		List<Employee> sortedList = empList.stream().sorted((e8, e9) -> e2.getAge() - e1.getAge())
				.collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
		// System.out.println(sortedList);
	}
}
