package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //Absolute Path
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[1]/div/input")).sendKeys("Ganesh");

        //Relative Path
        //driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Ganesh");

        //text() Method
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //and, or xpath locator
        //input[@class='form-control' and @id='password']
        //input[@class='form-control' or @id='passwor']
        //a[starts-with(text(),'Forgot')]
        //driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]")).click();
        //driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("Test");

        //contains()
        //driver.findElement(By.xpath("//input[contains(@id,'word')]")).sendKeys("Ganesh");
        //driver.findElement(By.xpath("//button[contains(text(),'In')]")).click();

        //following
        //input[@id='login1']//following::input

        //ancestor
        //input[@id='login1']//ancestor::div

        //child
        //span[@class='nav-text']//child::i

        //parent
        //div[@class='logobar flex maxwrap']//parent::div

        //descendant
        //div[@class='logobar flex maxwrap']//descendant::div

        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.id("datepicker")).click();

        List<WebElement> allDates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//child::td/a"));

        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase("30")) {
                e.click();
                break;
            }
        }
    }
}
