package day29_nestedloops_arrays;

public class NestedForLoop {
    public static void main(String[] args) {

        //for(int minute =1; minute <=5;minute++){
         //   System.out.println("\nminutes - " +minute);
          //  for(int second=1; second<=60; second++){
             //   System.out.print(second +" ");
         //   }
       // }

        for(int minute =0; minute <=4;minute++){
            for(int second=0; second<=59; second++) {

                System.out.println(minute + ":" + second);
            }
            }
    }

}
