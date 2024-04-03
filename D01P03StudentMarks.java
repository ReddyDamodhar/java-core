package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03StudentMarks {

	public static void main(String[] args) {
		int marks = 77;
        String grade;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the input:");
        
        int marks1 = sc.nextInt();
 
        if (marks1 >= 60) {
            grade = "A";
        } else if (marks1 >= 45) {
            grade = "B";
        } else if (marks1 >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }
 
        System.out.println("Grade: " + grade);
    }

	}


