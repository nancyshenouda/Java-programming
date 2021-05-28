package Tasks.Problem_Set;
/*
int x = 300;
int y = 400;
int z = x + y - x * y + x / y;
        300 + 400 - 300 * 400 + 300 /400
        700 - 120000 + 0
        700 - 120000
        -119300


What is the value of x, y, and z?
--------------------------------------------------------

	int z =  x   +   y -  x   * y   + x / y;
	   //  300   + 400 - 300 * 400 + 300 / 400
	   //  300   + 400 - 120000 + 300 / 400
	   //  300   + 400 - 120000 + 0
	   //  700 - 120000
	   // -119300
 */
public class Numbers2 {
    public static void main(String[] args) {


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        System.out.println(z);
        /*
               300+400-300*400+300/400

               300 + 400 -120000 + 0.75
               700 -120000 + 0.75
               - 119299.25

         */
    }
}
