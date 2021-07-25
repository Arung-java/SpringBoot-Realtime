package com.ashok.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LsitString {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		names.add("David");

		names.add("Brijesh");

		names.stream().distinct().forEach(System.out::println);
		// System.out.println(newList);
		names.stream().filter(name -> name.length() > 8).forEach(System.out::println);
		//System.out.println(newNames);
	}
}
