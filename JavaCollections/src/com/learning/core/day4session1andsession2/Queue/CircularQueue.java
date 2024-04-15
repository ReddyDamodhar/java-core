package com.learning.core.day4session1andsession2.Queue;

public class CircularQueue {
    int capacity;
    int[] a;
    int front;
    int rear;
    int size;

    public CircularQueue(int capacity){
        this.capacity = capacity;
        this.a = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isfull(){
        return size == capacity;
    }

    public void enqueue(int item){
        if(isfull()){
            System.out.println("Queue is Full");
        }
        rear = (rear+1) % capacity;
        a[rear] = item;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue id Empty");
        }
        int item = a[front];
        front = (front+1) % capacity;
        size--;
        return item;
    }

    public void peak(){
        System.out.println(a[front]);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue id Empty");
        }
        for(int item : a){
            System.out.println(item);
        }
    }
}
