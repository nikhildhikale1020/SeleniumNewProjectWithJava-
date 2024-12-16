import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicSelenium {

    public static void main(String[] args) throws InterruptedException {
      //  WebDriver driver = new EdgeDriver();
       WebDriver driver = new ChromeDriver();
       driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      // driver.close();

    }
}
