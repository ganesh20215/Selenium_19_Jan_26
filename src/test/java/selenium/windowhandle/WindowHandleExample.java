package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();

        //Current window It return
        String windowId = driver.getWindowHandle();

        //All window Id return(Including Child & Parent)
        Set<String>  allWindowIds = driver.getWindowHandles();

        for (String s : allWindowIds){
            if (!s.contentEquals(windowId)){
                driver.switchTo().window(s);
                Thread.sleep(3000);
                driver.findElement(By.linkText("INTERVIEW")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//a[text()='Get Resume Help']")).click();
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(windowId);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
