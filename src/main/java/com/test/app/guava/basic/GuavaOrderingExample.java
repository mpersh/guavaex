package com.test.app.guava.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;

public class GuavaOrderingExample {

	public void showOrdering() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(new Integer(7));
		numbers.add(new Integer(1));
		numbers.add(new Integer(19));
		numbers.add(new Integer(511));
		numbers.add(new Integer(23));
		numbers.add(new Integer(457435));
		numbers.add(new Integer(100));
		numbers.add(new Integer(3563456));
		numbers.add(new Integer(78907890));
		numbers.add(new Integer(234523));

		Ordering ordering = Ordering.natural();
		System.out.println("Input List: ");
		System.out.println(numbers);

		Collections.sort(numbers, ordering);
		System.out.println("Sorted List: ");
		System.out.println(numbers);

		System.out.println("======================");
		System.out.println("List is sorted: " + ordering.isOrdered(numbers));
		System.out.println("Minimum: " + ordering.min(numbers));
		System.out.println("Maximum: " + ordering.max(numbers));

		Collections.sort(numbers, ordering.reverse());
		System.out.println("Reverse: " + numbers);

		numbers.add(null);
		System.out.println("Null added to Sorted List: ");
		System.out.println(numbers);

		Collections.sort(numbers, ordering.nullsLast());
		System.out.println("Null first Sorted List: ");
		System.out.println(numbers);
		System.out.println("======================");

		List<String> names = new ArrayList<String>();

		names.add("Ivan");
		names.add("Sam");
		names.add("Jack");
		names.add(null);
		names.add("Pete");
		names.add("Joe");
		names.add("Nick");
		names.add("John");
		names.add("Alex");
		names.add("Fred");
		names.add("Denis");

		System.out.println("Another List: ");
		System.out.println(names);

		Collections.sort(names, ordering.nullsFirst().reverse());
		System.out.println("Null first then reverse sorted list: ");
		System.out.println(names);
	}
}
