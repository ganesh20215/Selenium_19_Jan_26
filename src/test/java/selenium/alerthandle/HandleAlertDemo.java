package selenium.alerthandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.letskodeit.com/practice");

        driver.manage().window().maximize();

        driver.findElement(By.id("confirmbtn")).click();

        Thread.sleep(2000);


        Alert a = driver.switchTo().alert();

        //accept alert
        //a.accept();

        //dismiss alert
        //a.dismiss();

        //System.out.println(a.getText());
        a.accept();

        driver.findElement(By.id("bmwcheck")).click();
    }
}
