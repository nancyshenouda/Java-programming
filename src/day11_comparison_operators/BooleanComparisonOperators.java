package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(985.44<98547.99);
        System.out.println(10<=11);
        System.out.println(5>=3);
        System.out.println(-100!=44);
        System.out.println("****************");
        int a=100;
        int b=200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println("******************");
        boolean result;
        result = 5==5;
        System.out.println("result = " + result);
        result = 33>44;
        System.out.println("result = " + result);
        result=88<99;
        System.out.println("result = " + result);
        
        result=10>=10;
        System.out.println("result = " + result);
        result=123<=124;
        System.out.println("result = " + result);

        String city="Seattle";
        System.out.println( city== "Seattle");
        System.out.println( city== "Baku");
        
        String name= "Nadir";
        boolean checkName=name=="Nadir";
        System.out.println("checkName = " + checkName);

        int age=2;
        boolean noMoreToddler =age > 3;
        System.out.println(noMoreToddler);

        age=65;
        boolean seniorCitizen=age >=65;
        System.out.println("Is senior citizen? " + seniorCitizen);




        
        



    }
}
