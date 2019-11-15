package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class TestCase2 {

    /*
    Step 1.Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Verify that number of listed examples is equals to 48.
    Hint: use findElemnts() and size() methods.
     */
    public static void main(String[] args) {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        int expectedResult = 48;
        int actualResult =  driver.findElements(By.className("list-group-item")).size();
        System.out.println("Expected Result "+ expectedResult);
        System.out.println("Actual Result "+ actualResult);
        StringUtility.verifyEquals(expectedResult,actualResult);

        driver.close();


    }


}
