package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodWithListReturn {
    public static void main(String[] args) {

        //ArrayList<Integer> list = getIntegerList();
        //System.out.println(list);

        int [] arr = getIntegerArray();
       System.out.println(Arrays.toString(arr));


    }
    public static ArrayList<Integer> getIntegerList(){

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0;i<=1000_1000;i++){

            nums.add(i);
        }
return nums;
    }
    public static int [] getIntegerArray(){
        int [] numArray = new int[1000_001];

        for(int i=0;i<=1000_000;i++){

           numArray[i]=i;
        }
        return numArray;
    }
}
