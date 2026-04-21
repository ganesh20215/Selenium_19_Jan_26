package testng.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

    @Test
    public void b1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void b2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void b3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void b4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.peoplenexusai.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}
