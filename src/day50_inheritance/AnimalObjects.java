package day50_inheritance;

public class AnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Kitty";
        System.out.println("Cat name: " + cat.name);
        cat.type = "scary";
        System.out.println("Cat type: " + cat.type);
        cat.jump();
        cat.speak();

        Dog dog = new Dog();
        dog.name = "Sushi";
        dog.type = "Maltize";
        System.out.println("dog name = " + dog.name);
        System.out.println("dog type = " + dog.type);
        dog.speak();
        dog.play();
    }
}
