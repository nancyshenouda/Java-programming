package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Exercise;

public class Running extends Exercise {
    @Override
    public void perform() {
        System.out.println("performing running exercise...");

    }

    @Override
    public int getCaloriesCount(int minutes) {

        return minutes*13;
    }
}
