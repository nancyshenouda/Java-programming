package day44_custom_class;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal(); // here wee are calling animal object from Animal class
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();

// we created a new object named cheetahObj
        Animal cheetahObj = new Animal();
        cheetahObj.type= "Cheetah";
        System.out.println(cheetahObj.type); // will print cheetah
        cheetahObj.eat("meat");
        cheetahObj.speak();



    }
}
