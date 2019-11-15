package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class TestCase3 {
   /*
   Step 1.Go to https://practice-cybertekschool.herokuapp.com
   Step 2. Click on “Multiple Buttons”
   Step 3. Click on “Button 1”
   Verify that result message is displayed: “Clicked on button one!”
    */
   public static void main(String[] args) {

       WebDriver driver = BrowserFactory.getDriver("chrome");
       driver.get("https://practice-cybertekschool.herokuapp.com");

       String expectedResult = "“Clicked on button one!”";

       driver.findElement(By.linkText("Multiple Buttons")).click();
       driver.findElement(By.tagName("button")).click();
       String actualResult= driver.findElement(By.id("result")).getText();

       System.out.println("Expected Result: "+expectedResult);
       System.out.println("Actual Result: "+actualResult);
       StringUtility.verifyEquals(expectedResult,actualResult);
       driver.close();
   }
}
