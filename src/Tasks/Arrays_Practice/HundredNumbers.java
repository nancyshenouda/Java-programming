package Tasks.Arrays_Practice;

/*
100numberarray
1.Create an int array called numbers that has length of 100
2.Assign 1-100 to each index of the array.
Then use a for each loop to print out all the elements of the array
 */
import java.util.Arrays;
public class HundredNumbers {
    public static void main(String[] args) {

        int[] num = new int[100];
int  count=0;
        //for(int i = 0;i< num.length;i++){
         //   num[i]=i+1;

       // }
        for(int each : num ){
            count++;
            System.out.print(count + " " );

        }

    }
    }



