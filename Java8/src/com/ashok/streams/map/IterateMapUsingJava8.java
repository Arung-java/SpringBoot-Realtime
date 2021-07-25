package com.ashok.streams.map;

import java.util.HashMap;
import java.util.Map;

public class IterateMapUsingJava8 {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(123, "Ashok");
		hashMap.put(234, "Raja");
		hashMap.put(345, "Kanakam");
		hashMap.put(456, "Laxmi");
		hashMap.put(567, "Prasad");

		// hashMap.entrySet().stream().forEach(entry ->
		// System.out.println(entry.getKey() + " " + entry.getValue()));

		// hashMap.entrySet().stream().forEach(entry ->
		// System.out.println(entry.getKey() + " - " + entry.getValue()));

		hashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	}
}
