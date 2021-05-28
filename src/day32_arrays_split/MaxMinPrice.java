package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        //1) find and print details of most expensive item.
        //2) find and print details of least expensive item.
        double mostExpensive = prices[0];
        int mostExpensiveIndex = 0;
        double leastExpensive = prices[0];
        int leaseExpensiveIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (prices[i] > mostExpensive) {
                mostExpensive = prices[i];
                mostExpensiveIndex=i;
            }

            if(prices[i]<leastExpensive){
            leastExpensive=prices[i];
            leaseExpensiveIndex=i;
        }
        }
        System.out.println("The most expensive item is: " + items[mostExpensiveIndex]+ " at " + mostExpensive + "$. ");
        System.out.println("The least expensive item is: " + items[leaseExpensiveIndex] + " at " + leastExpensive + "$. ");
    }
}
