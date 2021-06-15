package day46_encapsulation;

public class Car {
// encapsulating or hiding variables
    private String model;
    private int year;
    private int mileage;

    // setter method for model
    public void setModel(String carModel){

        model = carModel;
    }

    // getter method for model
    public String getModel(){

        return model;
    }

    // setter method for year
    public void setYear(int year){

        this.year = year;
    }
    //getter method for year
    public int getYear(){

        return year;
    }
    // setter method for mileage

    public void setMileage(int mileage){
        this.mileage=mileage;
        // this.variable name means we are referring to the instance variable if it has the same name as the method param name
    }
    //getter method for mileage
    public int getMileage(){

        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';

    }
}
