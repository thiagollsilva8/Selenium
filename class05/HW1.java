package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: don't worry if the text u send doesn't appear up in the textbox
 */

public class HW1 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // click on last alert and send keys
        WebElement lastAlertBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        lastAlertBtn.click();
        Alert confirmLastAlert = driver.switchTo().alert();

        Thread.sleep(3000);

        confirmLastAlert.sendKeys("Bruce Wayne");

        Thread.sleep(3000);

        confirmLastAlert.accept();

    }

}
