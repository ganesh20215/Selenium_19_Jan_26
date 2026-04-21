package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        driver.manage().window().maximize();

        WebElement srcElement = driver.findElement(By.id("draggable"));
        WebElement descElement = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);
        a.dragAndDrop(srcElement, descElement)
                .perform();
    }
}
