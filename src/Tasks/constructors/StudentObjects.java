package Tasks.constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student("Mike", 25, 'M', "Cybertek University");
        Student st2 = new Student("Smith", 28, 'M', "Cybertek University");
        Student st3 = new Student("Mary", 32, 'F', "Cybertek University");


        System.out.println("st1 = " + st1.toString());
        System.out.println("st2 = " + st2.toString());
        System.out.println("st3 = " + st3.toString());
    }
}
