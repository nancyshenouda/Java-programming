package day43_list_custom_classes;

import java.util.*;


public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        List<String> weekDays = getDays();
        System.out.println("weekDays = " + weekDays);
        weekDays.add("Java day");
        System.out.println("weekDays after adding java days = " + weekDays);

        System.out.println(getDays().get(3));
        System.out.println("size = "+ getDays().size());

        //removeIf method - java 8 --> accepts lambda - and easy to remove without loop
        weekDays.removeIf(day -> day.length()>6);
        System.out.println("weekDays after removing the days with more than 6 characters = " + weekDays);

        List<Integer> nums = getRandomList(7);

        System.out.println(getRandomList(100));
        System.out.println("nums size  = " + nums.size());
        nums.removeIf(n -> n<90);
        System.out.println("nums without numbers less than 90 = " + nums);

    }

    public static ArrayList<String> getDays() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday",
                "Thursday","Friday","Saturday", "Sunday"));
        days.remove(0);
        days.add(6,"Monday");

        return days;

    }

    public static List<Integer> getRandomList(int size){

        //size=100;
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=size;i++ ){
        list.add(random.nextInt(101));
        }
        return list;
        }
    }


