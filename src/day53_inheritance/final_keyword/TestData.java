package day53_inheritance.final_keyword;

public final class TestData {
    /**
     * TestData class that has a list of Constants.
     * the final variables naming convention is all uppercase format
     * values if below variables cannot be changed
     */

    public static final String ADMIN_USERNAME = "admin"; // if it is final, you MUST give it a value
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;

}

//class Child extends TestData{
   // WE CANNOT INHERIT FROM A FINAL CLASS
//}
