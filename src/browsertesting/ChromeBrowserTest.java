package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("tomsmith");//enter given username
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");//enter given password
        //tried to write code for login but did not work
        driver.close();//close the browser
    }
}
