package Tasks.Classes_Objects;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setDimensions(5,3);
        System.out.println("Area = " + rectangle.getArea());

        System.out.println(rectangle.toString());




    }
}
