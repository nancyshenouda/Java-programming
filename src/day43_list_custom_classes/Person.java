package day43_list_custom_classes;

//   firstName, age

public class Person {
    String firstName;
    int age;

}
class People{
    public static void main(String[] args) {
        //create object of Person class - instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age= 40;

        System.out.println(person1.firstName);
        System.out.println(person1.age);

        Person person2= new Person();
        person2.firstName= "Mike";
        person2.age = 35;

        System.out.println(person2.firstName);
        System.out.println(person2.age);


    }
}
