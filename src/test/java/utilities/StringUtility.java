package utilities;

public class StringUtility {
    public static void verifyEquals(String expected, String actual) {

        if (expected.equalsIgnoreCase(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
        public static void verifyEquals(int expected, int actual){
            if(expected==actual){
                System.out.println("PASSED");
            }else {
                System.out.println("FAIL");
            }
    }
}
