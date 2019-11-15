package tests.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class TestCase1 {

    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.com
         2. Click on “Sign Up For Mailing List”
         3. Enter any valid name
         4. Enter any valid email
         5. Click on “Sign Up” button
         Expected result: Following message should be displayed:
         “Thank you for signing up. Click the button below to return to the home page.”
         Home button should be displayed.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        String expectedResult1 ="“Thank you for signing up. Click the button below to return to the home page.”";
        String expectedResult2 ="Home";

        WebElement SignUp = driver.findElement(By.linkText("“Sign Up For Mailing List”"));
        SignUp.click();
        WebElement FullName = driver.findElement(By.name("full_name"));
        FullName.sendKeys("Ruhan Boz");
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("testcase1@maildrop.cc");
          Thread.sleep(3000);
        WebElement SignUpButton = driver.findElement(By.name("wooden_spoon"));
        SignUpButton.click();
        WebElement SignUpMessage = driver.findElement(By.name("signup_message"));
        String actualResult1= SignUpMessage.getText();
        WebElement HomeButton = driver.findElement(By.id("wooden_spoon"));
        String actualResult2=  HomeButton.getText();

        System.out.println("First Verification");
        System.out.println("Expected Result " + expectedResult1);
        System.out.println("Actual Result "+ actualResult1);
        StringUtility.verifyEquals(expectedResult1,actualResult1);
        System.out.println("Second Verification");
        System.out.println("Expected Result " + expectedResult2);
        System.out.println("Actual Result "+ actualResult2);
        StringUtility.verifyEquals(expectedResult2, actualResult2);

        driver.close();
    }


    }




