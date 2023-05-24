package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {

    public static void main(String[] args) throws InterruptedException {

        // instance of the WebDriver
        WebDriver driver = new ChromeDriver();

        // driver.get to navigate to the website
        driver.get("https://www.facebook.com/");

        // maximize the screen
        driver.manage().window().maximize();

        // click on create new account
        WebElement createAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccount.click();

        // sleep for a few seconds for DOM to load
        Thread.sleep(2000);

        // enter the first name
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Moazzam");

        // enter the last name
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Syntax");

        // enter the mobile number
        WebElement mobileNumber = driver.findElement(By.cssSelector("input[aria-label='Mobile number or email']"));
        mobileNumber.sendKeys("240-773-6070");



    }
}
