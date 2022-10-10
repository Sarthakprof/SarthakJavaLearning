package com.java.basic;

public class Ch7MultiplicationTable {
	
		void print() {
			for(int i=1; i<=10;i++) {
				System.out.printf("%d * %d = %d", 5, i, 5*i).println();
			}
			
		}		
		
		// making it generic to accept parameters that is print table of any number
		void print(int n) {
			for(int i=1; i<=10;i++) {
				System.out.printf("%d * %d = %d", n, i, n*i).println();
			}
			
		}		
}
