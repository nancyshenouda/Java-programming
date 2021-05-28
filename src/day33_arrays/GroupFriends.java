package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {

        String [] friends={"Nancy","Ramy","Heaven"};

//        for(int i=0;i<friends.length;i++){
//            System.out.println("Happy holidays " + friends[i] + "!");
//        }
        for(String each : friends){
            System.out.println("Happy holidays " + each+ "!");
        }
    }


}

