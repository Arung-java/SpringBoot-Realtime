package com.ashok.streams;

import java.util.List;

public class Employee implements Comparable<Employee> {

	private int age;
	private String name;
	private List<String> listOfCities;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int age, String name, List<String> listOfCities) {
		super();
		this.age = age;
		this.name = name;
		this.listOfCities = listOfCities;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getListOfCities() {
		return listOfCities;
	}

	public void setListOfCities(List<String> listOfCities) {
		this.listOfCities = listOfCities;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", listOfCities=" + listOfCities + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}

}
