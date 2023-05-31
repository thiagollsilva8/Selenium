package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/*
goto https://chercher.tech/practice/frames

click on check box
then select baby cat from drop down
then enter text in text box

 */

public class HW2 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url = " https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // click the check box
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        Thread.sleep(2000);

        // select baby cat from drop down
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dd);
        select.selectByVisibleText("Baby Cat");

        Thread.sleep(2000);

        // enter text in the text box
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("It's a kitten");

        Thread.sleep(2000);





    }

}
