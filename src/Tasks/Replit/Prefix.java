package Tasks.Replit;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //int n = scan.nextInt();

        String prefix = str.substring(str.charAt(0));
        System.out.println(prefix);
       if(str.startsWith(prefix)) {
          System.out.println("true");
        }

        }


    }

