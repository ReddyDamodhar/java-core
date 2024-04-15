package com.learning.core.day4session1andsession2.Queue;

public class QueueUsingLinkedlistTest {
    public static void main(String[] args){
        QueueUsingLinkedlist ql = new QueueUsingLinkedlist();
        ql.enqueue(89);
        ql.enqueue(99);
        ql.enqueue(109);
        ql.enqueue(209);
        ql.enqueue(309);
        ql.display();
        System.out.println();
        ql.dequeue();
        ql.display();
    }
}
