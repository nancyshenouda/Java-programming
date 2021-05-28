package Tasks.Arrays_Practice_2;
/*
[IQ] Second Biggest Number
Given an Array of numbers.
Find and print the 2nd biggest number.
Note the 2nd biggest should be unique meaning it should be different from the max number
Example:Input:[4,3,1,4,5,2,4,8,4,8]
Output:5
 */
public class SecondBiggestNumberV2 {
    public static void main(String[] args) {

        int []numbers= {4,3,1,4,5,2,4,8,4,8};
        int biggest =numbers[0];
        int secondBiggest=numbers[0];


        for( int each : numbers){
            if(each>biggest){
                secondBiggest=biggest;
                biggest=each;
            }
            if(each<biggest && each>secondBiggest){
                secondBiggest=each;
            }
        }

        System.out.println(secondBiggest);
    }
}
