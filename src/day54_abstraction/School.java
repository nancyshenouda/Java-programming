package day54_abstraction;

public class School {
    public static void main(String[] args) {

        //Student student = new Student(); Error as we cannot instantiate objects from abstract classes
            OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();
        onlineStudent.code("Java");

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
        campusStudent.code("Selenium");

        }
    }

