package day14_multi_branch_if_statements;
//import java.util.Scanner;
public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        //Scanner scan=new Scanner(System.in);
        char selection='n';
        boolean answer;
        String result;
        //'y'= scan.next();
        if(selection=='y'){
            System.out.println("Your file will be deleted");
            answer=true;
            result="deleted";
        }else{
            System.out.println("File deletion cancelled");
            answer=false;
            result="not deleted";
        }
        System.out.println("Did file get deleted? - " + result);
    }
}
