package com.example.interviewpreparation.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author kojusujan1111@gmail.com 30/12/21
 */

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>(Comparator.comparing(String::length));
        pq.add("sujan");
        pq.add("aaaaaaaa");
        pq.add("bcd");
        pq.add("b");
        pq.add("1234");
        pq.forEach(System.out::println);

     /* Since we did not tell the priority queue how to prioritize its content, it used a default natural ordering.
        In this case, it gave us the data back in the ascending order of the strings.
        This is not the same order in which items were added to the queue.
        What about having a custom ordering?
        This is possible as well, and we can do it with the help of a comparator. */
    }
}
