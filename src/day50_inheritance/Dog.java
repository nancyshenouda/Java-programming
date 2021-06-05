package day50_inheritance;

public class Dog extends Animal{
    public void play(){
        System.out.println(type + " can play");
    }

    @Override
    public void speak() {
        System.out.println(type + " dogs can almost literally speak");
    }
}
