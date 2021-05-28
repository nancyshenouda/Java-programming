package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day=4;
        if(day==1){
            System.out.println("Monday");
        }
        if(day==2){
            System.out.println("Tuesday");
        }
        if(day==3){
         System.out.println("Wednesday");
        }
        else if(day==4){
            System.out.println("Not matching");
        }

        System.out.println("******* MULTI BRANCH IF STATEMENT*******");
    }
}
