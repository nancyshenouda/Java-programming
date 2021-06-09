package OfficeHours.Practice_06_01_2021;

/*
- create a class called ScrumTeam
               Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            sprintNumber
                Constructor:
                      sets the names of: PO, BA, SM
                Actions:
                   addTester(Tester tester): adds the given tester to the testers arraylist
                   addTesters(Tester[] testers): adds the given testers to the testers arraylist
                   addDeveloper(Developer developer): adds the given developer to the developers arraylist
                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                   removeTester(long employeeID): removes the given tester from the testers arraylist
                   removeDeveloper(long employeeID): removes the developer from the developers arraylist
                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester> allTesters;
    ArrayList<Developer> allDevelopers;
    int sprintNumber;

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allTesters = new ArrayList<>();
        this.allDevelopers = new ArrayList<>();
    }
        public void addTester(Tester tester){ // it is reading from allTesters arraylist
        this.allTesters.add(tester);
}
        public void addTester(Tester [] testers ){
        this.allTesters.addAll(Arrays.asList(testers));
}
    public void addDeveloper(Developer developer) { // it is reading from allDeveloper arraylist
        this.allDevelopers.add(developer);
    }
    public void addDeveloper(Developer [] developers) { // it is reading from allDeveloper arraylist
        this.allDevelopers.addAll(Arrays.asList(developers));
    }

    /*
    removeTester(int employeeID): removes the given tester from the testers arraylist
     removeDeveloper(int employeeID): removes the developer from the developers arraylist
     toString(): prints number of tester,& developers,  PO name, SM name, BA name
     */
    public boolean removeTester(int employeeId ) {
        for(int i=0;i< allTesters.size();i++){
            if(allTesters.get(i).getEmployeeID()== employeeId){
                allTesters.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean removeDeveloper(int employeeId){ // same like the above method but with lambda
        int size = allDevelopers.size();
         allDevelopers.removeIf(eachDev -> eachDev.getEmployeeID()== employeeId);
         return size != allDevelopers.size();
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", businessAnalyst='" + businessAnalyst + '\'' +
                ", allTesters=" + allTesters +
                ", allDevelopers=" + allDevelopers +
                ", sprintNumber=" + sprintNumber +
                '}';
    }

    public static void main(String[] args) {
        ScrumTeam scrumTeam = new ScrumTeam("Nancy", "Mariam", "Aghaby");

    }
}
