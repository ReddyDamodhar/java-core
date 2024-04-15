package com.learning.core.day4session1andsession2.SearchingSorting;

public class QuickSort {
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int partion(int[] a, int lowIndex, int highIndex){
        int pivot = a[highIndex];
        int i = (lowIndex-1);
        for (int j = lowIndex; j <= highIndex-1; j++){
            if(a[j] < pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,highIndex);
        return i+1;
    }

    public void quickSort(int[] a, int lowIndex, int highIndex){
        if(lowIndex < highIndex){
            int pi = partion(a,lowIndex, highIndex);
            quickSort(a, lowIndex, pi-1);
            quickSort(a,pi+1, highIndex);
        }

    }
}
