package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class TestCase6{
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Registration Form”
    Step 3. Enter “user” into username input box.
   Step 4.Verify that warning message is displayed: “The username must be more than 6 and less than 30 characters long”
     */
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a [@href=\"/registration_form\"]")).click();

        driver.findElement(By.xpath("//input [@placeholder=\"username\"]")).sendKeys("user");
        String expectedMessage="The username must be more than 6 and less than 30 characters long";

        if (driver.findElement(By.xpath("//small[@data-bv-result=\"INVALID\"]")).getText().equals(expectedMessage)) {
            System.out.println("Test passed");
            System.out.println("The message is: "+driver.findElement(By.xpath("//small[@data-bv-result=\"INVALID\"]")).getText());
        } else {
            System.out.println("Test failed");
            System.out.println("The message is: "+driver.findElement(By.xpath("//small[@data-bv-result=\"INVALID\"]")).getText());
        }
        driver.close();
    }

}
