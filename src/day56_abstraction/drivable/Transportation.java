package day56_abstraction.drivable;

public abstract class Transportation {

    public abstract void transportPassengers();
    public abstract void cost(int miles);
    public void start(){
        System.out.println("Starting the engine");
    }
    public void stop(){
        System.out.println("Shut off the engine");
    }

}
