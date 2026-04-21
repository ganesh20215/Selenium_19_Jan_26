package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        WebElement textbox = driver.findElement(By.id("displayed-text"));

        System.out.println(textbox.isDisplayed());    //true
        hideBtn.click();
        System.out.println(textbox.isDisplayed());    //false
        showBtn.click();
        System.out.println(textbox.isDisplayed());    //true
    }
}
