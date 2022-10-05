package com.java.basic;

public class Ch2ExpressionsExample {

	public static void main(String args[]) {

		// 5 + 2 is an expression
		int add = 5 + 2;
		System.out.println("Addition= " + add);

		// 5 - 2 is an expression
		int sub = 5 - 2;
		System.out.println("Substraction= " + sub);

		// 5 * 2 is an expression
		int mul = 5 * 2;
		System.out.println("Multiplication= " + mul);

		// 5 / 2 is an expression, this will print 2 and not 2.5 as its int return type
		int div = 5 / 2;
		System.out.println("Division= " + div);

		// double division example, below will print 2.5
		double d = 5.0 / 2.0;
		System.out.println("double return type decimal example= " + d);

		// 5%2 is an expression, prints remainder
		int mod = 5 % 2;
		System.out.println("Modulo= " + mod);

		// complex expression, will follow PRECEDENCE, first mul then sub
		int complexExp = 5 - (2 * 4);
		System.out.println("Complex exp ressult= " + complexExp);

		// to calculate number of mins in a day
		int numberOfMins = 24 * 60;
		System.out.println("Number of mins in a day are= " + numberOfMins);

		// to calculate number of seconds in a day
		int numberOfSec = 24 * 60 * 60;
		System.out.println("Number of seconds in a day are= " + numberOfSec);

	}
}
