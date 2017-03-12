package com.test.app.guava.primitives;

import java.util.List;

import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;

public class PrimitivesExample {
	
	public void show() {
		PrimitivesExample primitivesExample = new PrimitivesExample();
		primitivesExample.intExamples();
		primitivesExample.charExamples();
	}
	
	private void intExamples() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// convert array of primitives to array of objects
		List<Integer> objectArray = Ints.asList(intArray);
		System.out.println(objectArray.toString());

		// convert array of objects to array of primitives
		intArray = Ints.toArray(objectArray);
		System.out.print("[ ");

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		System.out.println("]");

		// check if element is present in the list of primitives or not
		System.out.println("5 is in list? " + Ints.contains(intArray, 5));

		// Returns the minimum
		System.out.println("Min: " + Ints.min(intArray));

		// Returns the maximum
		System.out.println("Max: " + Ints.max(intArray));

		// get the byte array from an integer
		byte[] byteArray = Ints.toByteArray(20000);

		for (int i = 0; i < byteArray.length; i++) {
			System.out.print(byteArray[i] + " ");
		}
	}
	
	private void charExamples() {
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

		// convert array of primitives to array of objects
		List<Character> objectArray = Chars.asList(charArray);
		System.out.println(objectArray.toString());

		// convert array of objects to array of primitives
		charArray = Chars.toArray(objectArray);
		System.out.print("[ ");

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}

		System.out.println("]");

		// check if element is present in the list of primitives or not
		System.out.println("c is in list? " + Chars.contains(charArray, 'c'));

		// return the index of element
		System.out.println("c position in list " + Chars.indexOf(charArray, 'c'));

		// Returns the minimum
		System.out.println("Min: " + Chars.min(charArray));

		// Returns the maximum
		System.out.println("Max: " + Chars.max(charArray));
	}

}
