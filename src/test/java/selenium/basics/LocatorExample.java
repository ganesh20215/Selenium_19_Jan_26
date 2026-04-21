package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //1. Id Locator
        //driver.findElement(By.id("login1")).sendKeys("Snehal");

        //2. ClassName locator
        //driver.findElement(By.className("email-input")).sendKeys("Snehal");

        //3. Name Locator
        //driver.findElement(By.name("login")).sendKeys("Snehal");

        //4. linkText()
        //driver.findElement(By.linkText("Forgot password?")).click();

        //5. partialLinkText()
        //driver.findElement(By.partialLinkText("password?")).click();

        //6. tagName()
        /*List<WebElement> allElements = driver.findElements(By.tagName("div"));
        System.out.println(allElements.size());*/

        //7. cssSelector
        //driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("Ganesh");

        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input.email-input")).sendKeys("Ganesh");

    }
}
