package com.java.basic;

//Class is like an template
public class Ch6ClassAndMethod {
	int var1 = 5;
	
	//method
	public static void revolve() {
		System.out.println("Revolve");
	}
	
	public void revolve2() {
		System.out.println("Revolve2");
	}

	public static void main(String[] args) {
		
		//call the method of class 

		revolve();

		//calling non-static method by creating an instance of class
		Ch6ClassAndMethod obj = new Ch6ClassAndMethod();
		obj.revolve2();
		
		//accessing variables from ojbects
		System.out.println(obj.var1);
	}

}
