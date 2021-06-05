package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();  // static num = 10 > constructor num = 15
        StaticBlockDemo st2 = new StaticBlockDemo(); // constructor num = 20
        StaticBlockDemo st3 = new StaticBlockDemo(); // constructor num = 25
        System.out.println(StaticBlockDemo.num);
        // every time constructor runs it will make num+=5 so we add 5
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75

        System.out.println(StaticBlockDemo.carModels.get(5));


    }
}
