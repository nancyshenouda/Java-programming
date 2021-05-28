package OfficeHours.practice_03_17_2021;

public class CybertekBatches {
    public static void main(String[] args) {
        String batchType = "US";
        if (batchType.equals("US") || batchType.equals("us")) {
            boolean isMorning = true;
            if (isMorning)
                System.out.println("Class time is 10 - 5 EST");
            else
                System.out.println("Class time is 7- 10 pm ");
            }else if (batchType.equals("EU") || batchType.equals("eu")) {
                System.out.println("Class times are different ");
            } else {
                System.out.println("Invalid batch type");
        }

        }
    }


