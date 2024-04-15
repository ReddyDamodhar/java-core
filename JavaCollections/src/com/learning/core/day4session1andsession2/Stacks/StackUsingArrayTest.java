package com.learning.core.day4session1andsession2.Stacks;

import java.util.Stack;

public class StackUsingArrayTest {
    public static void main(String[] args){
       StackUsingArray sa = new StackUsingArray(4);
       sa.push("Hello");
       sa.push("World");
       sa.push("Java");
       sa.push("Programming");
       sa.pop();
       System.out.println(sa.peak());
       sa.display();
    }
}
