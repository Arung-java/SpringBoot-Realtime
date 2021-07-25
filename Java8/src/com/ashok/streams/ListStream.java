package com.ashok.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(50);
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(5);
		l.add(30);
		List<Integer> l2 = l.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(l2);

		List<Integer> l3 = l.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(l3);

		long l4 = l.stream().filter(i -> i < 15).count();
		System.out.println(l4);

		List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		Integer minVal = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minVal);

		Integer maxVal = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxVal);
		
		l.stream().forEach(System.out::println);
	}
}
