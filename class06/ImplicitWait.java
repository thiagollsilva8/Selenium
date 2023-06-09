package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {

    public static void main(String[] args) {

        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // declaring the implicit wait in the start as it is a global wait,
        // and we want it to be implemented on all the webElements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // click on create new account
        WebElement createNewAccountBtn = driver.findElement(By.xpath("a//a[text()='Create new account']"));
        createNewAccountBtn.click();

        // send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abracadabra", firstName);

    }

}
