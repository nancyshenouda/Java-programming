package day19_class_vs_object_strings;

// String Manipulation:

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {
        String city= "CHICAGO";
        System.out.println(true);// true
        System.out.println(city.equals("chicago")); // false (lower case c so String is case sensitive)
        System.out.println(city.equals("CHICAGO")); //  false ( again case sensitive)
        System.out.println(city.equals("Chicago "));// false (space at the end)

        //equals.IgnoreCase:

        System.out.println(city.equalsIgnoreCase("chicago")); // true
        System.out.println(city.equalsIgnoreCase("CHICAGO"));// true
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));// true
        System.out.println(city.equalsIgnoreCase("Chiicago"));//false (i wrong character)
        System.out.println(city.equalsIgnoreCase("Chi  ca  go")); // false (space is a character)

        if(city.equals("Chicago")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals ()  false");
        }

        if(city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCas true");
        }else{
            System.out.println("equalsIgnoreCas  false");
        }


    }
}
