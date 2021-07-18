package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(100); // 100 is added in the middle so no indexing or order in Set
        set.add(1);
        set.add(50);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); // no duplicates allowed in Set (it is the main benefit of Set)
        set.add(30);
        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("Java");
        words.add("collections");
        System.out.println(words);

        //convert Set to List
        List<String> wordsList = new ArrayList<>(words);
        System.out.println(wordsList); // it will still show the same order or words Set
        wordsList.get(1); // now we can use .get();
        wordsList.add("world"); // now we can add duplicate // it is added at the end
        System.out.println(wordsList);

        //System.out.println(((List) words).get(1)); //java.util.HashSet cannot be cast to java.util.List


        // looping through Set
        for( String each : words){
            System.out.print(each + ", ");
        }

        // LinkedHashSet
        System.out.println();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("cucumber"); // it will be added at the beginning so the insertion order is maintained
        linkedHashSet.add("14");
        linkedHashSet.add("java");
        linkedHashSet.add("$$");
        linkedHashSet.add("25");
        linkedHashSet.add("apple");
        linkedHashSet.add("25"); // it is still a Set so no duplicate
        System.out.println(linkedHashSet);
        //linkedHashSet.get(); it doesn't have .get(); method as it is Set

        // TreeSet
        // it keeps the natural order (lexicographical)
        // it has additional methods for searching
       TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("cucumber");// it will be added randomly
        treeSet.add("14");
        treeSet.add("java");
        treeSet.add("$$");
        treeSet.add("25");
        treeSet.add("apple");
        treeSet.add("25"); // it is still a Set so no duplicate
        treeSet.add("jeva"); // java with a first then jeva with e
        treeSet.add("Cucumber"); // it keeps natural order so Cucumber will come first
        System.out.println(treeSet);




    }
}
