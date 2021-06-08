package OfficeHours.Practice_06_8_2021;

public class ShapeObjects {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square square1 = new Square();
        square1.side= 5;
        square1.calculateArea();
        System.out.println("Area = " + square1.area);

        square1.calculatePerimeter();
        System.out.println("Perimeter = " + square1.perimeter);

        System.out.println(shape1.toString());
        System.out.println(square1.toString());

        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 3;
        rectangle1.length = 4;
        rectangle1.calculateArea();
        System.out.println("Rectangle area = " + rectangle1.area);
        rectangle1.calculatePerimeter();
        System.out.println("Rectangle perimeter = " + rectangle1.perimeter);
        System.out.println(rectangle1.toString());

        Circle circle1 = new Circle();
        circle1.radius = 10;
        circle1.calculateArea();
        circle1.calculatePerimeter();
        System.out.println(circle1.toString());
        System.out.println("Circle area = " + circle1.area);

        System.out.println("Circle perimeter = " + circle1.perimeter);
    }


}
