package OfficeHours.Practice_06_01_2021;

/*
- create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, coding(),  fixingBug(), toString()
 */
public class Developer {
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;
    private static boolean hasCodingSkills;

    public Developer(String name, int employeeID, String jobTitle, double salary){

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        hasCodingSkills= true;
    }
    public void coding(){
        System.out.println(this.name + " is coding");
    }
    public void fixingBug() {
        System.out.println(this.name + " is fixing a bug");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean hasCodingSkills() {
        return hasCodingSkills;
    }

}
