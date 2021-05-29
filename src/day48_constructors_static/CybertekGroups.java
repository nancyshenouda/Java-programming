package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CybertekGroups {
    public static void main(String[] args) {
        // dependency injection. Group object creation depends on String name
     Group grp1 = new Group("Ninja 17"); //

        // print size of the members
        System.out.println("grp1 size before adding members = " + grp1.getMembers().size());

        //adding members to the group
        grp1.addMember("Nancy");
        grp1.addMember("Maria");
        grp1.addMember( "Daud");
        grp1.addMember("Ivana");
        grp1.addMember("Kate");
        System.out.println("grp1 size after adding members = " + grp1.getMembers().size());
        System.out.println("grp1 members names = " + grp1);

        Group grp2 = new Group("CyberCats");
        grp2.setMembers(new ArrayList<>(Arrays.asList("Stephan", "Wakshu", "Akrem", "Bulent", "Andrea", "Andrie")));
        System.out.println("grp2 size = " + grp2.getMembers().size());
        // print all member without using toString()

        System.out.println("grp2 member = " + grp2.getMembers());

        // use if statement to check if Akrem in grp2
        if(grp2.getMembers().contains("Akrem")){
            System.out.println("Akrem is in grp2");
        }else{
            System.out.println("Akrem is Not in grp2");
        }

        }

    }

