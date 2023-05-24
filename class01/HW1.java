package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {

        // creating instance
        WebDriver driver = new ChromeDriver();

        // go to parabank
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        // find the element and send the first name
        driver.findElement(By.id("customer.firstName")).sendKeys("Thiago");

        // send text to the last name field
        driver.findElement(By.name("customer.lastName")).sendKeys("Silva");

        // send text to the address field
        driver.findElement(By.id("customer.address.street")).sendKeys("100 Edison Park Dr");

        // send text to the city field
        driver.findElement(By.name("customer.address.city")).sendKeys("Gaithersburg");

        // send text to the state field
        driver.findElement(By.id("customer.address.state")).sendKeys("Maryland");

        // send text to the zipcode field
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("20878");

        // send text to the telephone number field
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2407736070");

        //send text to the SSN field
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");

        //send text to the username field
        driver.findElement(By.id("customer.username")).sendKeys("HelloWorld");

        // send text to the password field
        driver.findElement(By.name("customer.password")).sendKeys("syntax123!$%");

        // send text to the confirm field
        driver.findElement(By.id("repeatedPassword")).sendKeys("syntax123!$%");

        // wait 3 seconds before closing the window to make sure form is filled
        Thread.sleep(5000);

        //close web browser
        driver.quit();



    }
}
