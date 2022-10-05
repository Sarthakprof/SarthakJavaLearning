package com.java.basic;

public class Ch3VariablesExamples {

	public static void main(String[] args) {
		
		//create a variable that should store text
		String name = "John";
		System.out.println(name);
		
		//create a variable that should store a number
		int myNum = 15;
		System.out.println(myNum);
		
		//declare a variable without assigning the value, and assign the value later
		int myNum2;
		myNum2 = 15;
		System.out.println(myNum2);
		
		//change the value of myNum from 15 to 20
		int myNum3 = 15;
		myNum3 = 20;  // myNum is now 20
		System.out.println(myNum3);
		
		/*
		 * If you don't want others (or yourself) to overwrite existing values,
		 *  use the final keyword (this will declare the variable as "final" or
		 *   "constant", which means unchangeable and read-only)
		 */

		final int myNum4 = 15;
		//myNum4 = 20;  // will generate an error: cannot assign a value to a final variable
	
	
		//other types
		int myNum5 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		//Declare multiple variables
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);
		
		//one value to multiple variables
		
		int a, b, c;
		a = b = c = 50;
		System.out.println(a + b + c);
	}

}
