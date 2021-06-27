package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        // the coming is regula object instantiate
        Animal animal = new Animal();
        animal.makeNoise();


        // the coming is polymorphism
        Animal dog = new Dog();
        dog.makeNoise();

        Animal dog2 = new Animal();
        dog2.makeNoise();


        Dog dog1 = new Dog();
        dog1.makeNoise();

        Animal cat = new Cat();
        cat.makeNoise();

        Animal horse = new Horse();
        horse.makeNoise();

        //polymorphic list of objects. List data type is Parent class
        //objects are any of child class
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

    }
}
