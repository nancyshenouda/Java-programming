package Tasks.Classes_Objects;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal type1 = new Animal();
        type1.type = "lion";
        System.out.println(type1.type);
        type1.eat();
        type1.speak();

        Animal type2 = new Animal();
        type2.type = "giraffe";
        System.out.println(type2.type);
        type2.eat();
        type2.speak();
    }
}
