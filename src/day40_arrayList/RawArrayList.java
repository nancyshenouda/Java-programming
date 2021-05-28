package day40_arrayList;

import java.util.*;
public class RawArrayList {
    public static void main(String [] args){
        // declaring Raw Arraylist:

        ArrayList list1= new ArrayList();
        List list2= new ArrayList();

        // adding values: it can have different data types (Raw Arraylist)
        list1.add("java");
        list1.add("is");
        list1.add("1234");
        list1.add(true);
        System.out.println(list1);
        System.out.println(list1.size()); // 4
    }
}
