package com.test.app.guava.basic;

import com.google.common.base.Preconditions;

public class GuavaPreconditionsExample {

	public void showPreconditions() {
		GuavaPreconditionsExample guavaPreconditionsExample = new GuavaPreconditionsExample();

		try {
			System.out.println(guavaPreconditionsExample.sqrt(-3.0));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(guavaPreconditionsExample.multiply(null, 9));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(guavaPreconditionsExample.getValue(11));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	public double sqrt(double input) throws IllegalArgumentException {
		Preconditions.checkArgument(input > 0.0, "Illegal Argument passed: Negative value %s.", input);
		return Math.sqrt(input);
	}

	public int multiply(Integer a, Integer b) {

		a = Preconditions.checkNotNull(a, "Illegal Argument passed: First parameter is Null.");
		b = Preconditions.checkNotNull(b, "Illegal Argument passed: Second parameter is Null.");

		return a * b;
	}

	public int getValue(int input) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Preconditions.checkElementIndex(input, data.length, "Illegal Argument passed: Invalid index.");

		return 0;
	}
}
