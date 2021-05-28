package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        
        //cars list

        List<String> myCars= new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Kia");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
       // myCars.remove(2);

        System.out.println(myCars.toString());// prints all cars
        String allCarsIn1Str= myCars.toString(); // stores all cars in one string variable
        System.out.println("allCarsIn1Str = " + allCarsIn1Str);
        
        myCars.add(0,"Lamborghini");
        System.out.println(myCars);

        myCars.set(3,"Honda"); // Honda will replace toyota in index 3
        System.out.println(myCars.toString());

        int ford = myCars.indexOf("Ford");
        System.out.println("Index of ford = " + ford);
        myCars.set(5,"BMW");
        System.out.println(myCars);

        if(myCars.contains("Honda")){
            System.out.println(myCars.set(myCars.indexOf("Honda"),"Bugatti" ));
            System.out.println(myCars);
        }else{
            System.out.println("myCars arrayList doesn't contain Honda");
        }


        for(int i=0;i<myCars.size();i++){
            if(myCars.get(i).equalsIgnoreCase("Lamborghini")){
                myCars.set(i,"prius");
            }
             if(myCars.get(i).equalsIgnoreCase("Lada")){
                myCars.set(i,"Lexus");
            }
             if(myCars.get(i).equalsIgnoreCase("Mazda")){
                myCars.set(i,"Audi");
            }
        }
        System.out.println("After loop = " + myCars);
    }
}
