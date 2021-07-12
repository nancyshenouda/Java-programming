package OfficeHours.Practice_07_12_2021;

public class PObjTest {
    public static void main(String[] args) {
        PA obj1 = new PA();
        Object obj2 = new PA();

        obj1.go(); // it runs PA GO
        ((PA)obj2).go(); // upcasting // it runs PA GO

        PB obj3 = new PC();
        obj3.go(); // it runs PC GO
        // if the object was new PB --> it will print PB GO

        ((PC)obj3).math(); // if the reference doesnt't have access to the method, we need to cast it (downCasting)
        ((PI)obj3).math(); // we can cast to Interface too

        PB obj4 = new PB();
        obj4.go(); // it run PB GO
        ((PI)obj4).math();
        // it throw ClassCastingException (unchecked exception / RunTimeException)
        // it needs to be fixed and cannot be handled by try/catch




    }
}
