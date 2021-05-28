package OfficeHours.Practice_03_18_2021;

public class CampusTime {
    public static void main(String[] args) {
        int time= 23;
        if(time <0 || time > 24 ) {
            System.out.println("invalid time");
        }else if(time >=8 && time <= 23) {
            System.out.println("Open");

        }else {
            System.out.println("Closed");
        }

    }

}
