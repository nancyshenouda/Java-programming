package day62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(); // polymorphism
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>(); // polymorphism

        cities.add("Mclean"); // add() method is from Collection or List interface
        cities.add("New York");
        cities.add("New York"); // List can accept duplicates
        System.out.println(cities);
        System.out.println(cities.get(0)); // List keeps the order
        System.out.println(cities.size()); // how many cities



    }
}
