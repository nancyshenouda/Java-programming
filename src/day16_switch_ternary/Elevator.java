package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 10;
        if(floorNum==1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verison, Starbucks");
        }else if(floorNum==2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat ");
        }else if(floorNum==3){
            System.out.println("Floor 3 is selected. Companies: Lyft, BofA, Stake house");
        }else {
            System.out.println("Invalid floor number");}

        System.out.println("****** Switch Statement version *********");

        floorNum = 6;
        switch(floorNum){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verison, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 is selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor number");
        }
    }
}
