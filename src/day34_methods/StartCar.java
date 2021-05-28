package day34_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
// the methods names can be in any order, but when we call them in the main method, they will run top to bottom
    public static void seatInCar() {
        System.out.println("1- Open the door and sit in driver seat.");
    }
        public static void startTheCar(){
            System.out.println("2- turn on the engine and move key clockwise ");
        }
               public static void  shiftToDrive(){
                   System.out.println("3- Press the brake pedal and move the gear to D");
               }
        public static void pressGasPedal(){
            System.out.println("4- Hold steering wheel with two hands and press gas pedal" );

        }



}
