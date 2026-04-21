package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //findElement()
        //1. Find a single web element on web page
        //2. WebElement is the return type of findElement
        //3. If element is not found then findElement method throws NoSuchElementException

       /* WebElement e1 = driver.findElement(By.id("l"));
        e1.sendKeys("Prerana..");*/

        //findElements()
        //1. Find a multiple web element on web page
        //2. List<WebElement> is the return type of findElements
        //3. returns an empty list if there are no elements found using the given locator

        List<WebElement> al = driver.findElements(By.tagName("input"));
        System.out.println(al.size());

        for (WebElement e : al){
            System.out.println(e);
        }

    }
}
