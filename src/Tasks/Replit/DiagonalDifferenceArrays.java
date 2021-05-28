package Tasks.Replit;
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1+5+9 = 15.
The right to left diagonal = 3+5+9 = 17.
Their absolute difference is |15-17| = 2
 */
import java.util.*;

public class DiagonalDifferenceArrays {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;

        int leftToRightSum = 0;
        int rightToLeftSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            leftToRightSum += matrix[i][i];}
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            rightToLeftSum += matrix[i][j];}
        result = leftToRightSum - rightToLeftSum;

        System.out.println(Math.abs(result));
    }

}
