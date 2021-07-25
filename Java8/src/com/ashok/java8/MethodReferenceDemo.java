package com.ashok.java8;

public class MethodReferenceDemo {

	public static void main(String[] args) {

//		FunctionalInterfDemo demo = () -> System.out.println("implementation of sam");
//		demo.singleAbstractMethod();

		Ashok a = new Ashok();
		FunctionalInterfDemo demo = a::ashokImpl;
		demo.singleAbstractMethod();
	}

}

class Test {
	public static void testImplementation() {
		System.out.println("Implementation by method reference");
	}
}