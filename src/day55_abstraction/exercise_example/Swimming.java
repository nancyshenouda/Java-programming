package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Exercise;

public class Swimming extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing swimming Exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {

        return minutes*30;
    }
}
