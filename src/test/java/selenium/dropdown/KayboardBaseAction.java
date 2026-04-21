package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KayboardBaseAction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='✕']")).click();

        Thread.sleep(2000);

        WebElement searchTextBox = driver.findElement(By.name("q"));

        Actions a = new Actions(driver);
        a.moveToElement(searchTextBox)
                .click(searchTextBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("tshirt")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }
}
