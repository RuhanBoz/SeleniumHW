package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class TestCase4 {
    /*
    Step 1.Go to https://practice-cybertekschool.herokuapp.com
    Step 2.Click on “Registration Form”
    Step 3.Enter “123” into first name input box.
    Step 4.Verify that warning message is displayed: "first name can only consist of alphabetical letters”
     */
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(" https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a [@href='/registration_form']")).click();

        driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("123");

        String expectedMessage="first name can only consist of alphabetical letters";
        if (driver.findElement(By.xpath("//small[@data-bv-result=\"INVALID\"]")).getText().equals(expectedMessage)) {
            System.out.println("Test passed");
            System.out.println("The message is: "+driver.findElement(By.xpath("//small[@data-bv-result=\"INVALID\"]")).getText());
        } else {
            System.out.println("Test failed");
            System.out.println("The message is: "+driver.findElement(By.xpath("//small[@data-bv-result=\"INVALID\"]")).getText());
        }
        driver.quit();

    }
    }









