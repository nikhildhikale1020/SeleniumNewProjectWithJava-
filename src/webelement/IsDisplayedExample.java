package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedExample {
    public static void main(String[] args) throws InterruptedException {
        //  WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("displayed-text"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        System.out.println(textbox.isDisplayed());
        hideBtn.click();
        System.out.println(textbox.isDisplayed());
        showBtn.click();
        System.out.println(textbox.isDisplayed());
        driver.close();

    }
}