package OfficeHours.Practice_06_14_2021;

/*
Create a class CandyFactory [ No inheritance with Candy classes ]

    This class is to create objects of Candy, Take5, Twix and see how they are working
 */
public class CandyFactory {
    public static void main(String[] args) {

        Candy candy = new Candy("generic", 10, true); // if quantity is -10, the value will print 0
        System.out.println(candy);

        Take5 barOne = new Take5(4, true);
        System.out.println(barOne);

        Twix barTwo = new Twix(5,false);

        System.out.println(Candy.getTotalNumberOfCandy()); // 3 as we created 3 objects of Candy

        System.out.println(barOne.getTotalNumberOfCandy());// it is possible but it is giving a warning
        
    }
}
