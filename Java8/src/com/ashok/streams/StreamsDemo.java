package com.ashok.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {

	public static List<Integer> findElements(List<Integer> arList) {
		List<Integer> newAl = new ArrayList<Integer>();
		for (Integer i : arList) {
			if (i >= 21)
				newAl.add(i);
		}
		return newAl;
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(20);
		al.add(30);
		al.add(34);

		List<Integer> arListFromMethod = findElements(al);
		for (Integer i : arListFromMethod) {
			System.out.println(i);
		}
	}
}
