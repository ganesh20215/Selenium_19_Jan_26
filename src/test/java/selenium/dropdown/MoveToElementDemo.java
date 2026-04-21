package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='✕']")).click();

        Thread.sleep(2000);

        WebElement loginElement = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions a = new Actions(driver);
        a.moveToElement(loginElement)
                .perform();
    }
}
