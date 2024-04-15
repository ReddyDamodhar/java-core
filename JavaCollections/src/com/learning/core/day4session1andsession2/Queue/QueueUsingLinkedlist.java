package com.learning.core.day4session1andsession2.Queue;

public class QueueUsingLinkedlist {
    private Node front;
    private Node rear;
    int size;

    public QueueUsingLinkedlist(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if (isEmpty()){
            front = node;
        }
        else {
            rear.next = node;
        }
        rear = node;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        int deleteData = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return deleteData;
    }
    public void display(){
        Node current = front;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }

    }
}
