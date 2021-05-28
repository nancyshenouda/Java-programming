package day45_oop;

public class TrafficLightObjects {

        public static void main(String[] args) {

            //create traffic light objects
            TrafficLight trafficLight = new TrafficLight();
            //trafficLight.color="red"; //  this is not the best practice, because we can assign anything to color now,
            // not only a valid color
            trafficLight.changeColor("red"); // this is the right way using a method of the class
            // to control the value of the variable
            trafficLight.showColor();

            TrafficLight trafficLight2 = new TrafficLight();
            trafficLight2.changeColor("blue");
            trafficLight2.showColor();

        }
    }

