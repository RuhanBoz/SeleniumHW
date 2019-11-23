package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class TestCase5 {
    /*
     Step 1. Go to https://practice-cybertekschool.herokuapp.com
     Step 2. Click on “Registration Form”
     Step 3. Enter “123” into last name input box.
     Step 4. Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash”
     */
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href=\"/registration_form\"]")).click();

        driver.findElement(By.xpath("//input [@placeholder=\"last name\"]")).sendKeys("123");
        String expectedMessage="The last name can only consist of alphabetical letters and dash";

        if (driver.findElement(By.xpath("//small[contains(text(), 'The last name c')]")).getText().equals(expectedMessage)) {
            System.out.println("Test passed");
            System.out.println("The message is: "+driver.findElement(By.xpath("//small[contains(text(), 'The last name c')]")).getText());
        } else {
            System.out.println("Test failed");
            System.out.println(driver.findElement(By.xpath("//small[contains(text(), 'The last name c')]")).getText());
        }
        driver.close();
    }
}
