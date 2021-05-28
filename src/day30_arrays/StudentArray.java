package day30_arrays;

import java.util.Arrays;

public class StudentArray {
    public static void main(String[] args) {

       //longer way. it is used when we don't know the values of the variables yet.
        String [] student1 = new String [5];
        student1 [0]="1234";
        student1 [1]="Nancy";
        student1 [2] = "Shenouda";
        student1 [3] = "B22";

        // shorter way.. it is used when we know the values already.
        String  [] student2= {"9999", "Mike", "Adam", "B22"};

        System.out.println("student1 ID = " + student1 [0]);
        System.out.println("Student1 first name =" + student1 [1]);
        System.out.println("Student1 last name = "+ student1 [2]);
        System.out.println("Student1 batch number = " + student1 [3] );

        System.out.println("student2 ID = " + student2 [0]);
        System.out.println("Student2 first name =" + student2 [1]);
        System.out.println("Student2 last name = "+ student2 [2]);
        System.out.println("Student2 batch number = " + student2 [3] );

        System.out.println("Student1 data length = " + student1.length);
        System.out.println("student2 data length = " + student2.length);

        if(student1.length ==5){ // check if the arrays length has 5 items.
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        if(student1.length==student2.length){
            System.out.println("Students data arrays length match");
        }else{
            System.out.println("Students data arrays length mismatch");
        }


        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        int [] nums ={22,55,11};
        for(int i=0; i<nums.length;i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.println();
        System.out.print(Arrays.toString(nums));
    }
}
