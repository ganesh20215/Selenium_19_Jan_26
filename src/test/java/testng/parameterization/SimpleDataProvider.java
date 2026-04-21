package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleDataProvider {

    @DataProvider(name = "testData")
    public Object[][] getDataFromFun() {
        Object[][] obj = {{"standard_user", "Test"}, {"Test", "secret_sauce"}, {"Test", "Test"}};

        return obj;
    }


    @Test(dataProvider = "testData")
    public void verifyParameterizationDemo(String userName, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        WebElement productElement = driver.findElement(By.xpath("//h3[@data-test='error']"));

        SoftAssert sf = new SoftAssert();
        sf.assertTrue(productElement.isDisplayed());

        sf.assertAll();
        driver.close();
    }

}
