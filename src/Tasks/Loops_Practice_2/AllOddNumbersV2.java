package Tasks.Loops_Practice_2;

/*
•Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class AllOddNumbersV2 {
    public static void main(String[] args) {

//        int oddNum=0;
//
//        while(oddNum<100){
//            if(oddNum%3==0 && oddNum%5==0){
//
//                System.out.print(oddNum+", ");
//
//            }
//            oddNum++;
//        }
        for(int i=0; i<100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
