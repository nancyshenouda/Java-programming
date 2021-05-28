package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
       boolean isHungry=true;
       if(isHungry) {
           System.out.println("Let's eat something, then code java");
           //isHungry = true;
       } else{
               System.out.println("I am not hungry, lets keep coding java");
              // isHungry = false;
           }

       double price=50;
       boolean isAffordable= price<=200.0;
       if (isAffordable) {
           System.out.println("I can afford it, lets buy it");
       }else{
           System.out.println("Too Expensive, lets keep coding java");}


       boolean isRemoteJob=false;
       if(isRemoteJob!=true){
           System.out.println("Sorry not interested");}
       else{
           System.out.println("Sure, what is the interview process");}
           }
       }



