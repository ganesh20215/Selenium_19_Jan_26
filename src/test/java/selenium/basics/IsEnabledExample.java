package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement enabledBtn = driver.findElement(By.id("enabled-button"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement textbox = driver.findElement(By.id("enabled-example-input"));

        System.out.println(textbox.isEnabled());    //true
        disableBtn.click();
        System.out.println(textbox.isEnabled());    //false
        enabledBtn.click();
        System.out.println(textbox.isEnabled());    //true
    }
}
