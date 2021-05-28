package day34_methods;

public class FirstMethod {
   public static void main(String[] args){
       displayMessage();  //1st call the method
       displayMessage();
       displayMessage();

       for(int i=1; i<=10; i++){
           System.out.print(i + " - ");
           displayMessage();

            sum(1,2,3);
            greaterNumber(10,6);
       }
   }
// first custom reusable method
   public static void displayMessage(){ // method name has to be something meaningful and it can be any name(camel Case)
        System.out.println("Hello B22 friends");
    }

    //Write a method that calculates the sum of 3 numbers
    public static void sum(int num1, int num2, int num3){
       int sum = num1+num2 + num3;
        System.out.println(sum);

    }
    //Write a method that shows the grater number from 2 numbers

    public static void greaterNumber(int num1, int num2){
       int greater=0;
       if(num1 > num2){
           greater=num1;
           System.out.println("num1 is =" + greater);
       }else{
           greater=num2;
           System.out.println("num2 is = " + greater);
       }
        calculator(6,3,"*");
    }
    //Write a method that accepts 3 parameters:
    // 1-number
    // 2-number
    // 3-operator(-,+,*,/)
    // Sample output:
    // calculator(6,3, “+”)   --> 9
    // calculator(6,3, “-”)   -->  3
    // calculator(6,3, “*”)   --> 18
    // calculator(6,3, “/”)   --> 2
    public static void calculator(int num1,int num2, String operator){
        int sum=0;
       switch(operator){
           case "+":
               //sum=num1+num2;
               System.out.println((num1+num2));
               break;
           case "-":
               //sum=num1-num2;
               System.out.println((num1-num2));
            break;
           case "*":
               //sum= num1*num2;
               System.out.println((num1*num2 ));
               break;
           case "/":
               //sum=num1/num2;
               System.out.println((num1/num2));
                break;
       }
    }
    }

