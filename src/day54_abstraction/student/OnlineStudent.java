package day54_abstraction.student;


public class OnlineStudent extends Student{

        @Override
        public void attendClass(){
            System.out.println("online students attend the classes on zoom.");
        }

        //public abstract void askQuestions(); // error we cannot create abstract methods in normal classes.
    // The class has to be abstract to have abstract methods
    }


