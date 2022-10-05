package com.java.basic;

public class Ch5StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "1" + "2";
		System.out.println(s1); //prints 12
		
		String s2 = "1" + 2;
		System.out.println(s2); //prints 12
		
		String s3 = "1" + 2 + 3;
		System.out.println(s3); //prints 123
		
		String s4 = "ABC" + "DEF" + "GHI";
		System.out.println(s4); //prints ABCDEFGHI

	}

}
