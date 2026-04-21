package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));

        System.out.println(bmwRadioBtn.isSelected());    //false
        bmwRadioBtn.click();
        System.out.println(bmwRadioBtn.isSelected());    //true
    }
}
