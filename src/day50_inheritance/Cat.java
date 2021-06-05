package day50_inheritance;

public class Cat extends Animal{
    public void jump(){

        System.out.println(type + " cats can jump");
    }
    @Override
    public void speak(){
        System.out.println(type + " cats can say scary stuff");
    }
}
