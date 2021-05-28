package day40_arrayList;
import java.util.*;
public class ArraysListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("shoppingList size = " + shoppingList.size());
        System.out.println("isEmpty - " + shoppingList.isEmpty());



        shoppingList.add("shoes");
        shoppingList.add("masks");
        shoppingList.add("wooden spoon");
        shoppingList.add("clothes");
        shoppingList.add("java book");

        System.out.println(shoppingList);

        if(shoppingList.isEmpty()){ // isEmpty is a method to check the size of the ArrayList
            System.out.println("Keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }

        int count = shoppingList.size();

        System.out.println("shopping list items =  " + count);

        System.out.println("is shoes in my shopping list? - " + shoppingList.contains("shoes"));// returns boolean

        if(shoppingList.contains("shoes")){
            System.out.println("shoes is in the list");
        }else{
            System.out.println("Shoes is not in the list");
        }

        shoppingList.remove("shoes");
        System.out.println(shoppingList);

        shoppingList.clear(); // it removes all the items
        System.out.println("empty shopping list =  " + shoppingList);
    }
}
