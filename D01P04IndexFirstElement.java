package com.learning.core.day1session1;

import java.util.Scanner;
import java.util.HashMap;

public class D01P04IndexFirstElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
       
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
 
     
        int[] arr = new int[N];
 
       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
 
   
        HashMap<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE; 
 
  
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                int firstIndex = map.get(arr[i]);
                minIndex = Math.min(minIndex, firstIndex);
            } else {
                map.put(arr[i], i);
            }
        }
 
        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("Index of the first repeating element: " + minIndex);
        }
 
        scanner.close();
    }
}

