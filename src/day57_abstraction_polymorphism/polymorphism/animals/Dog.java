package day57_abstraction_polymorphism.polymorphism.animals;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Dog is saying woof woof from dog class");
    }
}
