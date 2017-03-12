package com.test.app.guava.math;

import java.math.BigInteger;
import java.math.RoundingMode;

import com.google.common.math.BigIntegerMath;
import com.google.common.math.LongMath;

public class MathExamples {
	
	public void show() {
		MathExamples mathExamples = new MathExamples();
		mathExamples.longExamples();
		mathExamples.bigIntegerExamples();
	}
	
	private void longExamples() {
		try {
			System.out.println(LongMath.checkedAdd(Long.MAX_VALUE, Long.MAX_VALUE));

		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println(LongMath.divide(100, 5, RoundingMode.UNNECESSARY));
		try {
			// exception will be thrown as 100 is not completely divisible by 3
			// thus rounding is required, and RoundingMode is set as UNNESSARY
			System.out.println(LongMath.divide(100, 3, RoundingMode.UNNECESSARY));

		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Log2(16): " + LongMath.log2(16, RoundingMode.HALF_EVEN));

		System.out.println("Log10(10): " + LongMath.log10(10, RoundingMode.HALF_EVEN));

		System.out.println("sqrt(100): " + LongMath.sqrt(LongMath.pow(10, 2), RoundingMode.HALF_EVEN));

		System.out.println("gcd(100,50): " + LongMath.gcd(100, 50));

		System.out.println("modulus(100,50): " + LongMath.mod(100, 50));

		System.out.println("factorial(5): " + LongMath.factorial(5));
	}
	
	private void bigIntegerExamples() {
		System.out.println(BigIntegerMath.divide(BigInteger.TEN, new BigInteger("2"), RoundingMode.UNNECESSARY));

		try {
			// exception will be thrown as 100 is not completely divisible by 3
			// thus rounding is required, and RoundingMode is set as UNNESSARY
			System.out.println(BigIntegerMath.divide(BigInteger.TEN, new BigInteger("3"), RoundingMode.UNNECESSARY));

		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Log2(2): " + BigIntegerMath.log2(new BigInteger("2"), RoundingMode.HALF_EVEN));

		System.out.println("Log10(10): " + BigIntegerMath.log10(BigInteger.TEN, RoundingMode.HALF_EVEN));

		System.out.println(
				"sqrt(100): " + BigIntegerMath.sqrt(BigInteger.TEN.multiply(BigInteger.TEN), RoundingMode.HALF_EVEN));

		System.out.println("factorial(5): " + BigIntegerMath.factorial(5));
	}

}
