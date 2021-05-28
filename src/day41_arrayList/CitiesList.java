package day41_arrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        // declare ArrayList
        ArrayList<String> cities = new ArrayList<>();
        // add values (cities ) to arrayList --> add methods

        cities.add("Washington"); // 0 index
        cities.add("Vienna");  // 1 index
        cities.add("New York"); // 2 index
        cities.add("Adana"); // 3 index
        cities.add("LA"); // 4 index

        // add Ashgabat to the list

        cities.add(0, "Ashgabat");

        //print values in the same line
        System.out.println(cities);

        // print first and last city

        System.out.println("First city = " + cities.get(0)); // first
        System.out.println("Last City = " + cities.get(cities.size() - 1));//last

        //print count of items in the arraylist

        System.out.println("Count of items = " + cities.size());

        // use for loop and print all values in same line

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + ", ");
        }
        System.out.println();

        for (String each : cities) {
            System.out.print(each + ", ");
        }
        System.out.println();
        //delete item from arraylist
        //1) remove using index. delete value at index 3
        cities.remove(3);
        //2) remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " + cities);

        //delete/remove all values from list
        cities.clear();

        //make sure it is clear
        //1) print|spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if (cities.size() == 0) {
            System.out.println("list is empty");
        }
    }
}
