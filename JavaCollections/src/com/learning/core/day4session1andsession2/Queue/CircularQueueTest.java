package com.learning.core.day4session1andsession2.Queue;

public class CircularQueueTest {
    public static void main(String[] args){
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.dequeue();
        cq.display();
        cq.peak();
    }
}
