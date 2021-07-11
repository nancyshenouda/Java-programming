package day61_exceptions_collections.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("About to sleep for 5 seconds");
        /**
         * Thread.sleep(1000) throws a checked exception or an interrupted exception
         * We MUST handle it as below
         */
        try {
            Thread.sleep(5000); // checked exception means it is being checked during the compile time
        } catch (InterruptedException e) {
            e.printStackTrace(); // only prints when exception happen
        }
        System.out.println("Woke up after 5 seconds");

        /**
         * the below way is declaring it by using throws InterruptedException keywords
         */

        System.out.println("About to sleep for 10 seconds");
        Thread.sleep(10000);
        System.out.println("Woke up after 10 seconds");


    }
}
