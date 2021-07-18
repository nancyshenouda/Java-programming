package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {

        ElementaryStudent student = new ElementaryStudent();
        student.setName("Nancy");
        System.out.println(student.getName());
        student.setAge(15);
        System.out.println(student.toString());

    }
}
