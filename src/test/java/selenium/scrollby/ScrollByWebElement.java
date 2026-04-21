package selenium.scrollby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWebElement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement e = driver.findElement(By.xpath("//a[text()='Disclaimer']"));

        //Scroll Down
        JavascriptExecutor js = (JavascriptExecutor) driver;    //down casting
        js.executeScript("arguments[0].scrollIntoView();", e);

        //scroll up
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -2000)");
    }
}
