package com.learning.core.day1session1;

public class D01P03PatternTriangle {

	public static void main(String[] args) {
		int number = 5;
		 
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

