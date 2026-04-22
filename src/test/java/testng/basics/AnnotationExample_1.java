package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample_1 {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequsite(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void postCondition(){
        driver.close();
    }


    @Test
    public void ts1(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void ts2(){
        driver.get("https://www.amazon.com/");
    }
	
	@Test
    public void ts3(){
        driver.get("https://www.edso.in/");
    }
}
