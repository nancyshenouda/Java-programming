package day50_inheritance;

/**
 * Child class
 * Sub class
 * Derived class
 */
public class Teacher extends Person{

    int teacherID;

    public void teach(String topic){
        System.out.println( name + " is teaching " + topic);

    }
}
