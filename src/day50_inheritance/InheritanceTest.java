package day50_inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Nancy";
        p1.age = 33;
        p1.walk();
        p1.talk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        System.out.println(t1.teacherID);
        t1.name = "Mariam";
        t1.age = 35;
        t1.walk();
        t1.talk();
        t1.teach("java");

        Student student= new Student();
        student.name = "Ramy";
        student.school = "Cybertek";
        System.out.println("School name: " + student.school);
        student.age = 16;
        System.out.println("Age is " + student.age);
        student.studentID = 1111;
        System.out.println("Student ID: " + student.studentID);
        student.talk();
        student.walk();
        student.work("java programmer");
        student.study("Selenium");




    }
}

