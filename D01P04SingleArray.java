package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P04SingleArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter two numbers (separated by space) between 1 and 40: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
 
     
        int[] array = {5, 19, 30, 8, 17};
 
    
        boolean foundNum1 = false;
        boolean foundNum2 = false;
        for (int i = 0; i < array.length; i++) {
            if (num1 == array[i]) {
                foundNum1 = true;
            }
            if (num2 == array[i]) {
                foundNum2 = true;
            }
        }
 
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Not found");
        }
 
        scanner.close();
    }
}

