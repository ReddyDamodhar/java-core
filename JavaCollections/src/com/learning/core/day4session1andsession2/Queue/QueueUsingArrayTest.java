package com.learning.core.day4session1andsession2.Queue;

public class QueueUsingArrayTest {
    public static void main(String[] args){
        QueueUsingArray qa = new QueueUsingArray(6);
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.enqueue(40);
        qa.dequeue();
        qa.display();
        qa.peak();

    }
}
