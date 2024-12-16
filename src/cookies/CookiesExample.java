package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

        Cookie adcookie = new Cookie("company","Edso services");
        driver.manage().addCookie(adcookie);


       /* Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);*\

        */

        driver.manage().deleteCookieNamed("company");
        driver.close();
    }
    }

