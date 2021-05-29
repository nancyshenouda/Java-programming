package day48_constructors_static;


// this is called composition in java, when we Has-A relationship. Bus Has-A driver // Bus Has-A engine
public class Bus {
Driver driver;
Engine engine;


    public String toString(){
    return driver.getName() + " | " + engine.getCylinder();
}
}


