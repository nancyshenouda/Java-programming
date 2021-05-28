package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        // the constructor runs every single time we write the keyword new
        Student st2 = new Student();

        Student st3 = new Student("Nancy");
        Student st4 = new Student("Mariam");
        Student st5= new Student(35);
        Student st6 = new Student("Ramy ", 22);






    }
}
