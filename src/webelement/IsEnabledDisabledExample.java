package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDisabledExample {
    public static void main(String[] args) throws InterruptedException {
        //  WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("enabled-example-input"));
        WebElement enabledBtn = driver.findElement(By.id("enabled-button"));
        WebElement disabledBtn = driver.findElement(By.id("disabled-button"));
        System.out.println(textbox.isEnabled());
        disabledBtn.click();
        System.out.println(textbox.isEnabled());
        enabledBtn.click();
        System.out.println(textbox.isEnabled());

        driver.close();


    }
}
