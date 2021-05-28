package day38_methods;

public class MyClass {
    public static void main(String[] args) {
        MyClass.a();
        MyClass.b();
        MyClass.c();

    }
    public static void a(){
        System.out.println("a");
    }
    public static void b(){
       a();
        System.out.println("b");
    }
    public static void c(){
        b();
        System.out.println("c");
    }
}
