package Tasks.Classes_Objects;
/*
[Rectangle]
Create a class Rectangle
-Create these variables in the class: width, height, area(all double)
-Create these methods (non-static):
-setDimensions()-parameters: width, height (Do not name the parameters the same as your class variable names)
-return: void-action: assigns the width and height of the object given from the parameters.
Also calculate the area of the rectangle in the method and store to the area variable. (area = width * height)
-getArea()-parameters: none
-return: -action: returns the area variable
-toString() generate the toString method as shown in class.
See Murodil_only for screenshots of steps
-Create a class RectangleObject
-Create Rectangle objects, call these Dimensions and getArea methods of the objects
 */
public class Rectangle {
    double width;
    double height;
    double area;

    public void setDimensions(double widthParam, double heightParam){
       width=widthParam;
       height=heightParam;

    }
    public double getArea(){
        area = width*height;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
}
