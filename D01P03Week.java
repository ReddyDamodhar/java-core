package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03Week {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Enter a week number (1-7): ");
        int weekNumber = scanner.nextInt();
 
        if (weekNumber == 1) {
            System.out.println("The weekday is Sunday");
        } else if (weekNumber == 2) {
            System.out.println("The weekday is Monday");
        } else if (weekNumber == 3) {
            System.out.println("The weekday is Tuesday");
        } else if (weekNumber == 4) {
            System.out.println("The weekday is Wednesday");
        } else if (weekNumber == 5) {
            System.out.println("The weekday is Thursday");
        } else if (weekNumber == 6) {
            System.out.println("The weekday is Friday");
        } else if (weekNumber == 7) {
            System.out.println("The weekday is Saturday");
        } else {
            System.out.println("Invalid input");
        }
    }
}

