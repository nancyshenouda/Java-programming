package Tasks.Arrays_Practice;
/*
Max and Min number from Array
•Write a program that can find the maximum number from any given int array
•Write a program that can find the minimum number from any given int array
 */
public class MaxAndMinNumberV2 {
    public static void main(String[] args) {

        int [] numbers = {7,10,50,1,100,17};

        int max =numbers[0];
        int min=numbers[0];

        for(int i=0;i < numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }

        System.out.println("max number is " + max);
        System.out.println("min number is " + min);
    }
}
