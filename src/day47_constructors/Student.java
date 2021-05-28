package day47_constructors;

public class Student {

    // No-args constructor

    public Student(){
        System.out.println("No-Args constructor");
    }
    public Student(String name){
        System.out.println("name param Constructor | name = " + name);
    }

    public Student(int age){

        System.out.println("age param constructor | age = " + age);
    }
    public Student(String name, int age){

        System.out.println("name and age param constructor | age = " + name + age );
    }

}
