package day62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        List<Integer> scores = new LinkedList<>(); // polymorphism
        students.add("Nancy");
        students.add("Mariam");
        students.add("Nancy");
        students.addFirst("Ramy");
        System.out.println(students);
        System.out.println("Index 0 " + students.get(0)); // it keeps the order

        scores.add(20);
        scores.add(40);
        scores.add(23);
        scores.add(20);

        System.out.println(scores); // it accepts duplicates
        System.out.println(scores.get(0));
    }
}
