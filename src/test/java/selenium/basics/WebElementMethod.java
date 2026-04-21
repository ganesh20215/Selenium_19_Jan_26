package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement e = driver.findElement(By.xpath("//input[@id='login1']"));
        //e.sendKeys("Ganesh");

        Thread.sleep(2000);
        //e.clear();

        WebElement loginBtn = driver.findElement(By.className("signin-btn"));
        //loginBtn.submit();

        //System.out.println(loginBtn.getText());

        //System.out.println(loginBtn.getTagName());
    }
}
