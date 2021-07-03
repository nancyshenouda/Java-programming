package day59_polymorphism_exceptions;

import Tasks.Replit.Animal;
import day57_abstraction_polymorphism.polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //1- instance of operator

        Shape shape = new Circle();
        System.out.println(shape instanceof Circle); // it return boolean
        System.out.println(shape instanceof Square); // it will return false
        System.out.println(shape instanceof Shape);

        if(shape instanceof Circle){
            System.out.println("it is a Circle object");
        }else if(shape instanceof Square){
            System.out.println("It is a Square object");
        }

        //2- java reflection API
        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());
        System.out.println(shape.getClass());

        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a Square object");
        }

        System.out.println(shape.getClass().getDeclaredMethods().length);// return the number of methods in Circle class
        //System.out.println(shape.getClass().getDeclaredFields().getClass().getName());



    }
}
