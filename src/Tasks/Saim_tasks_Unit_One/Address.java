package Tasks.Saim_tasks_Unit_One;

import java.util.Locale;

/*
A person will enter their address into a String. Make sure the String is not empty.
    If it is empty print: "No address found".
    If there is an address make all the text uppercase to match the expected format

        Ex:
            Input: 231332 leaf ave, lake city 3132
            Output: 231332 LEAD AVE, LAKE CITY 3132

        Ex:
            Input: ""
            Output: No address found

 */
public class Address {
    public static void main(String[] args) {

        String address = "8108 essex grove way";

        if(address.isEmpty()) {
            System.out.println("No address found!");

      //  } else if(address.toUpperCase()){}

        }
    }
}
