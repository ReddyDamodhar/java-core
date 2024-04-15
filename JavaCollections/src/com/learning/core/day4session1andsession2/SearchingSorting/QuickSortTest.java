package com.learning.core.day4session1andsession2.SearchingSorting;

public class QuickSortTest {
    public static void main(String[] args){
        int[] a = {10, 7, 8, 9 ,1, 5};
        QuickSort qs = new QuickSort();
        qs.quickSort(a, 0, a.length-1);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

}
