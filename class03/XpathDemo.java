package class03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathDemo {

    public static void main(String[] args) {

        //instance of the webDriver
        WebDriver driver = new ChromeDriver();

        // driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // maximize the screen
        driver.manage().window().maximize();

        // userName text box through xpath
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        // password text box
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        // login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
        loginBtn.click();
        
        // click on the Pim tab
        WebElement pimTab = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimTab.click();



    }
}
