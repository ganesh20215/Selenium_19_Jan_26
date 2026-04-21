package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

    @Test
    public void verifySoftDemoAssertion() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement productElement = driver.findElement(By.xpath("//span[text()='Products']"));
        WebElement swagLabsElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        SoftAssert sf = new SoftAssert();
        sf.assertEquals(productElement.getText(), "products", "Text should be products");
        sf.assertFalse(swagLabsElement.isDisplayed(), "Swag Labs Element should be displayed");

        sf.assertAll();
        driver.close();
    }
}
