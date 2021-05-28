package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("My name is: " + fullName()); // no value mentioned here
        System.out.println("Married? "+ isMarried());
        System.out.println("My age is: " + getAge());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());

        String name =fullName(); // giving additional value
        System.out.println("name = " + name);
        boolean isMarried = isMarried();
        System.out.println("isMarried = " + isMarried);
       
        int age=getAge();
        System.out.println("age = " + age);

        int random = getRandomYear();
        System.out.println("random = " + random);

        if(isMarried()){
            System.out.println("Married");
        }else{
            System.out.println("Single");
        }
        System.out.println(letters());
    }
    public static String fullName(){
        //fullName(); we cannot put the method name inside the method.
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }

    public static int getRandomYear(){
       Random random = new Random() ;
       int randomYear=random.nextInt(2021);
       return randomYear;
    }
    public static char letters(){

        return 'A';

    }
}
