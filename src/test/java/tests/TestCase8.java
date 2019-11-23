package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class TestCase8 {
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Registration Form”
    Step 3. Enter “5711234354” into phone number input box.
    Step 4. Verify that warning message is displayed: “Phone format is not correct”
     */

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();
        driver.findElement(By.xpath("//input [@placeholder=\"571-000-0000\"]")).sendKeys("5711234354");
        String expectedMessage="Phone format is not correct";

        if(driver.findElement(By.xpath("//small[starts-with(text(), 'Phone format')]")).getText().equals(expectedMessage)) {
            System.out.println("Test passed");
            System.out.println("Message is: "+driver.findElement(By.xpath("//small[starts-with(text(), 'Phone format')]")).getText());
        } else System.out.println("Test failed");
        driver.close();
    }
}
