package com.java.basic;

//Class is like an template
public class Ch6ClassAndMethod {
	
	//method
	public void revolve() {
		System.out.println("Revolve");
	}

	public static void main(String[] args) {
		
		//object call the method of class
		Ch6ClassAndMethod obj = new Ch6ClassAndMethod();
		obj.revolve();

	}

}
