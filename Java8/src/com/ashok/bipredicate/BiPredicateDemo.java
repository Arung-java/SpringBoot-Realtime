package com.ashok.bipredicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> predicate = i -> (i > 10);
		System.out.println(predicate.test(9));

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Ashok"));

		BiPredicate<Integer, Integer> checkSumOftwo = (a, b) -> a + b >= 5;
		System.out.println(checkSumOftwo.test(2, 8));

		BiFunction<Integer, Integer, Integer> multiplyBoth = (a, b) -> a * b;
		System.out.println(multiplyBoth.apply(10, 5));

	}
}
