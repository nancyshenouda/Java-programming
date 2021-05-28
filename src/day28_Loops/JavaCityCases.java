package day28_Loops;
/*
loop day = 1 till day 30

every day there are 200 new cases

every sunday(day % 7 == 0) there are 500 new cases

"day 1 - daily cases: 200"
--------------
print totalCases =
 */
public class JavaCityCases {
    public static void main(String[] args) {

        int totalCases= 0;

        for(int day = 1; day <=30; day++){
            if(day%7==0){// Sundays
                totalCases+=500; // more cases in Sunday
            }else {
            totalCases+=200;
            }
            System.out.println("Day " + day + "  total cases: " + totalCases);

            }

        System.out.println("JavaCity November 30 total Cases is " + totalCases);
    }
}
