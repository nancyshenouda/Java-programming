package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("one");
        queue.add("two"); // it allows duplicates
        queue.add("three");
        queue.add("four");


        //System.out.println(queue.element()); // First element added, but if queue is empty, it will throw NoSuchElement exception
        //System.out.println(queue.peek()); // first element added, but if queue is empty, it will return null

        System.out.println(queue.remove()); // remove the last added element
        System.out.println(queue);
        System.out.println(queue.poll()); // remove the element on the top
        System.out.println(queue);
    }
}
