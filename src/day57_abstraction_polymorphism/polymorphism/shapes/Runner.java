package day57_abstraction_polymorphism.polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        //Shape shape = new Shape();


        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        /**
         * create list of Shapes and store 10 different shapes
         * using a loop print out each shape
         */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

        //System.out.println(shapes); prints Hashcodes of objects
        for (Shape eachShape : shapes) {
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);
    }

        /**
         * static method to drawShapes
         * accepts objects of shape
         * then calls draw method
         */

        public static void drawShape(Shape shape){
            System.out.println("----Drawing shape----");
            shape.draw();


        }
    }


