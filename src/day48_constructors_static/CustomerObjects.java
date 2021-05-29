package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1); // it is showing the default values that we gave in the first constructor

        customer1.setId(12);
        customer1.setName("Fady");
        System.out.println(customer1);

        Customer customer2 = new Customer("Nancy", 1235);
        System.out.println(customer2.toString());

        Customer customer3 = new Customer("Mariam", 1780);
        System.out.println( customer3);
        // creating Array to store customer objects
        Customer [] customerArray = {customer1,customer2,customer3, new Customer("Ramy", 234)};
        System.out.println(Arrays.toString(customerArray));

        // creating ArrayList and adding customers objects to it
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(new Customer("Heaven", 111));
        customerList.add(new Customer("Emmanuel", 999));
        System.out.println(customerList);

        // print info of the FIRST customer object from Array and ArrayList:

        System.out.println(customerArray[0]); // index 0  in Array
        System.out.println(customerList.get(0)); // index 0 in Array List
        // how to loop through this List?

        System.out.println("----- for loop -----");
        for(int i =0;i<customerList.size(); i++){
            System.out.println(customerList.get(i));
        }
        System.out.println("---- for each loop -------");

        for(Customer each : customerList){
            System.out.println(each);
        }

        // print all names of customers in the list

        System.out.println("---- only names of customers----");

        for(Customer each : customerList){
            System.out.println(each.getName());
        }
        System.out.println("---- only ID of customers-----");

        customerList.forEach(each-> System.out.println(each.getId())); // same for each loop using lambda expression


    }
}
