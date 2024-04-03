package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03Factorial {

	public static void main(String[] args) {
		{
			int product =1;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number:");
			
			int factorial = sc.nextInt();
			
			
			for (int i=5; i>=1; i--)
			{
				product=product*i;
			
			}
			System.out.println("factorial of a number is:"+product);
		}
	 
	}

	}


