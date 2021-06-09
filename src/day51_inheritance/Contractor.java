package day51_inheritance;

public class Contractor extends Employee{

    @Override
    //1- lets every oe you are overriding this method.
    //ensures that this method is being overriden. if not, it shows error.
    public double calculateSalary(double hourlyRate){

        return 50*40* hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
