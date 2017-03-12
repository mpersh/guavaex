package com.test.app.guava.basic;

import com.google.common.base.Optional;

public class GuavaOptionalExample {
	
	public void showOptional() {
		GuavaOptionalExample guavaOptionalExample = new GuavaOptionalExample();

		Integer value1 = null;
		Integer value2 = new Integer(5);
		Integer value3 = new Integer(1000);

		// Optional.fromNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.fromNullable(value1);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);

		Optional<Integer> c = Optional.of(value3);

		System.out.println(guavaOptionalExample.multiply(a, b));
		System.out.println(guavaOptionalExample.multiply(b, c));
	}

	public Integer multiply(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not
		System.out.println("First parameter is present: " + a.isPresent());

		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.or - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.or(new Integer(0));

		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();

		return value1 * value2;
	}

}
