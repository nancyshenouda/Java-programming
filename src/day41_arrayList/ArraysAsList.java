package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(23,1,34,54,654,1000);
        System.out.println("nums = " + nums);
        //nums.add(100); unsupported operation because we used Arrays.asList method and it returns immutable list, 
        // that size cannot be modified

      nums= new ArrayList(Arrays.asList(23,1,34,54,654,1000,100));
        System.out.println("nums = " + nums);
        
        List<Double> numbers = Arrays.asList(23.6,10.99,40.55);
        numbers=new ArrayList<>(Arrays.asList(23.6,10.99,40.55));
        numbers.add(100.55);
        numbers.remove(23.6);
        System.out.println("numbers = " + numbers);
        numbers.remove(0);
        System.out.println("numbers after removing  = " + numbers);


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","coke","pepsi", "Red bull",
                "monster","mdew","kambucha","celsius"));

        int caffeineAmount =0;


        System.out.println("drinks With Caffeine = " + drinksWithCaffeine);

        for ( String drink : drinksWithCaffeine){
            if(drink.equalsIgnoreCase("monster") || drink.equalsIgnoreCase("red bull") || drink.equalsIgnoreCase("celsius")){
                caffeineAmount=150;
                System.out.println(drink + "--> " + caffeineAmount);
            }else if(drink.equalsIgnoreCase("coffee") || drink.equalsIgnoreCase("kambucha")){
                caffeineAmount=112;
                System.out.println(drink + "--> " + caffeineAmount);
            }else if(drink.equalsIgnoreCase("tea")|| drink.equalsIgnoreCase("coke")|| drink.equalsIgnoreCase("pepsi")){
                caffeineAmount=35;
                System.out.println(drink + "--> " + caffeineAmount);
            }
        }


        for(String each : drinksWithCaffeine){
            switch(each){
                case"monster": case "red bull": case "celsius":
                    caffeineAmount=150;
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount=112;
                    break;
                case "tea": case "coke": case "pepsi":
                    caffeineAmount=35;

            }
            System.out.println("There is " + caffeineAmount + " caffeine amount in " + each);
        }
       drinksWithCaffeine.forEach(drink-> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("drink = " + each);
            System.out.println("-------");
        });
    }
}
