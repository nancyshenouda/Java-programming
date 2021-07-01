package day54_abstraction.student;

/**
 * we add abstract keyword to a class to make it an abstract class
 * We cannot create objects from Student Class meaning:
 * Student student = new Student(); ---> will show error
 */
public abstract class Student {

    public void code(String language){
        System.out.println("Student is coding using " + language);
    }
    public abstract void attendClass(); // abstract method that has no method body
}





