package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {

        switch (browser) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

        }

        // maximize screen
        //driver.manage().window().maximize();

        // navigate to url
        driver.get(url);

        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


    public static void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }

    }


    public static void sendText(String text, WebElement element) {

        element.clear();
        element.sendKeys(text);
    }
}
