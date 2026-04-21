package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.letskodeit.com/practice");

        driver.manage().window().maximize();

        WebElement dp = driver.findElement(By.id("carselect"));

        Select s = new Select(dp);

        //getOptions()
        /*List<WebElement> allOptions = s.getOptions();
        for (WebElement e : allOptions){
            System.out.println(e.getText());
        }*/

        //selectByIndex
        //s.selectByIndex(2);

        //selectByValue
        //s.selectByValue("benz");

        //selectByVisibleText()
        //s.selectByVisibleText("Honda");

        //getAllSelectedOptions()
        List<WebElement> e = s.getAllSelectedOptions();
        for (WebElement e1 : e) {
            System.out.println(e1.getText());
        }
    }
}
