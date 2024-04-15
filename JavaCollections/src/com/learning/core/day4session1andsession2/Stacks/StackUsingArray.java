package com.learning.core.day4session1andsession2.Stacks;

public class StackUsingArray {
    int capacity;
    String[] a;
    int top;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.a = new String[capacity];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public void push(String str){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        a[++top] = str;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return null;
        }
        return a[top--];
    }

    public String peak(){
        return a[top];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
        }
        for (int i = 0;i<=top;i++){
            System.out.println(a[i]);
        }
    }
}
