package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParameterExample {

    public static WebDriver driver;

    @Parameters("browserName")
    @BeforeMethod()
    public void setUp(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Parameters({"userName", "password"})
    @Test
    public void verifyParameterizationDemo(String userName, String password) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        WebElement productElement = driver.findElement(By.xpath("//span[text()='Products']"));
        WebElement swagLabsElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        SoftAssert sf = new SoftAssert();
        sf.assertEquals(productElement.getText(), "Products", "Text should be products");
        sf.assertTrue(swagLabsElement.isDisplayed(), "Swag Labs Element should be displayed");

        sf.assertAll();
        driver.close();
    }
}
