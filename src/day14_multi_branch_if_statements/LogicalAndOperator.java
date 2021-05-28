package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
        System.out.println(10>5 && 1==1);

        System.out.println(9>8&&3>6);
        System.out.println(77==100&&50>40);
        
        int apples=5, oranges=3;
        boolean check = apples>5 && oranges >3;
        System.out.println("check = " + check);

        if(apples>6&&oranges>2){
            System.out.println("I have enough apples and oranges");
        }else{
            System.out.println("I need to go to wall mart to buy fruits");
        }
    }
}