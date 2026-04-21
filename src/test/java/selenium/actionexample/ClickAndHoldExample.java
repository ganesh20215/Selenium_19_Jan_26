package selenium.actionexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHoldExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        driver.manage().window().maximize();

        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));

        Actions a = new Actions(driver);
        a.clickAndHold(elementA)
                .pause(Duration.ofSeconds(15))
                .release(elementA)
                .perform();
    }
}
