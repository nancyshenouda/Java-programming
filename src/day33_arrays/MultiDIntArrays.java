package day33_arrays;

public class MultiDIntArrays {
    public static void main(String[] args) {
        int[][] nums2D= {
                {12,  55,  4, 7},    //0
                {123, 555, 9},       //1
                {56, 87, 455, 34},   //2
                {234, 12, 54, 23, 25}//3
        };
        System.out.println(nums2D[2][2]);  //455
        System.out.println(nums2D[3][4]);//25
        System.out.println();
        for(int i=0;i< nums2D.length;i++){
            System.out.println();
            for(int n=0; n< nums2D[i].length;n++){
                System.out.print(nums2D[i][n] + ", ");

            }
        }

    }
}
