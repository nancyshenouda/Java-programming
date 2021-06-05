package day50_inheritance;

/**
 * Child class
 * Sub class
 * Derived class
 */
public class Student extends Person{

    int studentID;
    String school;

    public void study(String topic){

        System.out.println(name + " is studying " + topic + " at " + school);
    }

}
