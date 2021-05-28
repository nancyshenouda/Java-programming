package OfficeHours.Practice_04_12_2021;

public class MaxMinNumbersArray {
    public static void main(String[] args) {

        int [] numbers={1,4,7,3,8,9,10,11,100};
        int max =numbers[0];
        int min =numbers[0];

        for(int each :numbers){
            if(each>max){
                max=each;
            }
             if(each<min){
                min=each;
            }
        }
        System.out.println("max number is - "+ max);
        System.out.println("min number is - "+ min);
    }
}
