package day45_oop;

public class TrafficLight {

    String color;
    // this is the read only method, display value of color variable
    public void showColor(){
        System.out.println("current color is " + color);
    }
    //this is the updates of value of color variable
    public void changeColor(String newColor){
        // we use if condition to control the value of the color
        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")) {
            color = newColor;

            System.out.println("Changing color of " + newColor);
        }else{
            System.out.println("Error: invalid color");
        }
    }

}

