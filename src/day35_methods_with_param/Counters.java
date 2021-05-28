package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        //int num=999;
        //count(num);
        String word = "wooden spoon"; // it will count from 0 to 12 which is the count of wooden spoon letters
        count(word.length());
        printAge(1981);
    }
    public static void count(int num){
        for(int i=0; i<=num;i++){
            System.out.print(i + " ");
        }

        System.out.println();
    }
    public static void printAge(int year){


            System.out.println("My Birth year is: " + year + " and my Age is: "+ (2021-year));


    }
}
