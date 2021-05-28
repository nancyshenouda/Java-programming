package day13_conditional_statements;

import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("**** Welcome to TD Bank ATM ****** \n Enter pin code");
        int secretPincode= scan.nextInt();
        //int inputPincode=1234;
        if(secretPincode==1234){
            System.out.println("Welcome to your account.\n You can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pin code! \n Please try again");}

    }
}
