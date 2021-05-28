package OfficeHours.Practice_04_19_2021;

public class MethodClassAndTest {
    public static void main(String[] args) {
        MethodClass.methodOne(); // we can call this one because it is VOID and already printed in the method
        System.out.println(MethodClass.methodTwo());// this one is return and has to be printed out to get the value
        System.out.println(MethodClass.methodThree("java"));
        System.out.println(ReverseEachWord.reverseEachWord("it is raining out side"));
    }
}
