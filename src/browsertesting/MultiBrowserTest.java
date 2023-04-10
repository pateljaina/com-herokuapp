package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.findElement(By.id("username")).sendKeys("tomsmith");//places username in username field
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");//places password into password field
        driver.close();//close the browser
    }
}
