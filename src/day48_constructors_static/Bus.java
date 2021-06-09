package day48_constructors_static;


// this is called composition in java, when we HAS-A relationship. Bus HAS-A Driver // Bus HAS-A Engine
public class Bus {
Driver driver;
Engine engine;


    public String toString(){


        return driver.getName() + " | " + engine.getCylinder();
}
}


