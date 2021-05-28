package OfficeHours.Practice_05_04_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LameDB {
    public static String lameDb(String db, String op, String id, String data) {
        ArrayList<String>  list = new ArrayList<>(Arrays.asList(db.split("#")));
        System.out.println(list);

        int idNumber =0;
        switch(op){
            case "add":

                break;
            case "edit":
                list.set(idNumber-1,id+data);
                break;
            case "delete":
                list.remove(idNumber-1);
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa")); //  1etsy#2wooden#3spoon#4aaa
        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb")); // 1test#2bbb#3foo
        System.out.println(lameDb("1tst#2bla#3foo","delete","1","")); // 2bla#3foo

    }
}

