package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        // how can we find the price of an item?
        // both item and price will be in the same position in the arrays(same index).

        System.out.println("------- find the index of Gloves in items array------");
        for(int i=0; i<items.length;i++){
            if(items[i].equals("Gloves")){
                System.out.println("Index of Gloves is " + i);
            }
        }

        System.out.println("------- set boolean to true if first 'iPad' is found");
        boolean isIpadFound=false;
        for(String item:items){ // we didn't use for loop as we are not interested in the index
            if(item.equalsIgnoreCase("iPad")){
                isIpadFound=true;
                System.out.println("iPad found = " + isIpadFound);
                break;
            }
        }
        System.out.println("----- print a report of each shopping item and price------");

        for(int i=0; i< items.length;i++){
            System.out.println(items[i] + " price: " +prices[i] + "$ \t# " + itemIDs[i]);
        }
        System.out.println("----- Look for 'jacket' in items and print all details-----");

        for(int i=0; i< items.length;i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i] + " price: " +prices[i] + "$ \t# " + itemIDs[i]);
            }
        }
        for(int i=0; i<items.length;i++){
            if(items[i].equalsIgnoreCase("iPad")){
                System.out.println("Price if the iPad is: "+ prices[i] + "$");
            }
        }
        }
    }

