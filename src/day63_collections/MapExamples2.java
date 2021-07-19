package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {

        // HashMap
        Map<Integer, Person> map = new HashMap<>();

        map.put(32, new Person("Nancy", 32));
        map.put(null, new Person("", 20));
        map.put(12, new Person("Nick", 10));

        System.out.println(map.get(31));
        System.out.println(map.get(null));
        System.out.println(map.get(32));
        System.out.println(map);

        //LinkedHashMap // only difference is that the insertion order will be gauranteed

        Map<Integer, Person> map2 = new LinkedHashMap<>();

        map2.put(32, new Person("Nancy", 32));
        map2.put(null, new Person("", 20));
        map2.put(12, new Person("Nick", 10));
        System.out.println(map2);

        //TreeMap // doesnt accept null // it follows natural order

        Map<Integer, Person> map3 = new TreeMap<>();

        map3.put(32, new Person("Nancy", 32));
        map3.put(0, new Person("", 20));
        map3.put(-12, new Person("Nick", 10));
        System.out.println(map3); // -12 -> 0 -> 32
    }

}
