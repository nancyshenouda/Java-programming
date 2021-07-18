package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        // Map is an interface
        // it accepts two object reference of any type
        // it is in key/value format
        // key MUST be unique
        // value can be duplicated
        // id, names
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Nancy");
        map.put(2, "Mariam");
        map.put(1, "Heaven");
        // in case of duplicated key, the value will get updated So it will print 1=Heaven for lines 13 and 15
        map.put(100, "Ramy"); //(key is not only numerical it can be any type)
        System.out.println(map.get(2)); // it accepts the key and return the value of this key // "Mariam"
        System.out.println(map);
        System.out.println(map.get(50)); // it will return null as there is no key 50
        //map.remove(1); // it removed the whole entry (key+value)
        System.out.println(map.containsKey(2)); // true
        System.out.println(map.containsValue("Nancy")); // false

        for(  Integer each: map.keySet()){
            System.out.println(each + " - " + map.get(each));

            // to get a certain key if we know only the value
            if(map.get(each).equals("Heaven")){
                System.out.println("This is our key " + each);
            }
        }


    }
}
