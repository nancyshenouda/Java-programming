package Tasks.Classes_Objects;

/*
Create a class CandyFactory [ No inheritance with Candy classes ]

    This class is to create objects of Candy, Take5, Twix and see how they are working

 */
public class CandyFactory {
    public static void main(String[] args) {

        Candy chocoCandy = new Candy("chocoCandy", 10, false, 200);
        System.out.println(chocoCandy.toString());
        System.out.println("chocoCandy.getQuantity() = " + chocoCandy.getQuantity());
        
    }
}
