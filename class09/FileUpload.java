package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {

    public static void main(String[] args) {

        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // find the element which you can click to upload the file
        WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));

        // in order to send/upload the file, You can send the path of that file in sendKeys.
        // the file path will be different for everyone depending on their own system
        fileUploadBtn.sendKeys("C:\\Users\\thiag\\OneDrive\\Desktop\\zen_studio_latest.exe");
    }
}
