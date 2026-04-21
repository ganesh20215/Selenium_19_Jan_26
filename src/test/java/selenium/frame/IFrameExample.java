package selenium.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IFrameExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //By Index
        //driver.switchTo().frame(0);

        //By name or id
        //driver.switchTo().frame("demo-frame");

        //By WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));


        Thread.sleep(2000);
        driver.findElement(By.id("datepicker")).click();

        /*List<WebElement> allIds = driver.findElements(By.tagName("iframe"));
        System.out.println(allIds.size());*/

    }
}
