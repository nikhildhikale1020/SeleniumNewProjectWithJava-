package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);
/* WebElement userNameTextBox = driver.findElement(By.id("login1"));
userNameTextBox.sendKeys("nikhil@gmail.com");*/
       /* WebElement signInBtn = driver.findElement(By.className("signinbtn"));
        signInBtn.click();*/

      /*  WebElement passwordTextBox = driver.findElement(By.name("passwd"));
        passwordTextBox.sendKeys("nikhil@gmail.com");
        Thread.sleep(2000);
      //  driver.close();*/
       /* WebElement createNewAccountLink = driver.findElement(By.linkText("Create a new account"));
        createNewAccountLink.click();*/

      /*  WebElement userNameTextBox = driver.findElement(By.cssSelector("input[id='login1']"));
        userNameTextBox.sendKeys("nikhil@gmail.com");*/

        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("nikhil@gmail.com");
        Thread.sleep(2000);
    }
}