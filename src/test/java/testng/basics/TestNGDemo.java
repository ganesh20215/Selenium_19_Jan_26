package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void verifyPracticePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void verifyEdsoServices() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void verifyRediffmailDemo() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.close();
    }

}
