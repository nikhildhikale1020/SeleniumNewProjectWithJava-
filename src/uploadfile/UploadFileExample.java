package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement uploadBtn = driver.findElement(By.id("file-upload"));
        uploadBtn.sendKeys("C:\\Users\\Dell\\Desktop\\NEW FILE\\28.10.png");

        driver.findElement(By.id("file-submit")).click();

        WebElement uploadedMessage = driver.findElement(By.xpath("//h3[text() = 'File Uploaded!']"));
        if (uploadedMessage.getText().equalsIgnoreCase("File Uploaded!")) {
            System.out.println("File is successfully uploaded...");
        }else {
            System.out.println("File is not uploaded...");
        }

            driver.close();
        }

        }




