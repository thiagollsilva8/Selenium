package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) throws InterruptedException {

        // creating instance
        WebDriver driver = new ChromeDriver();

        // initializing the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        // maximize screen
        driver.manage().window().maximize();

        // enter username
        WebElement userName = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");


        // leave username blank


        // click on login button
        WebElement loginButton = driver.findElement(By.cssSelector("input[id='btnLogin']"));
        loginButton.click();

        // wait 3 seconds
        Thread.sleep(3000);

        // verifying the error msg
        WebElement errorMsg = driver.findElement(By.cssSelector("span[id='spanMessage']"));
        String msg = errorMsg.getText();
        System.out.println(msg);

        driver.quit();

    }
}
