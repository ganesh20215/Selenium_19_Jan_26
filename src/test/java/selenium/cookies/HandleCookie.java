package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleCookie {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        //Add Own Cookie
        Cookie cc = new Cookie("Company", "Edso Services");
        driver.manage().addCookie(cc);

        //Get All Cookie
        Set<Cookie>  allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }

        //getCookieNamed
        //System.out.println(driver.manage().getCookieNamed("Company"));

        //delete cookie
        System.out.println();
        System.out.println("-------------Delete Cookie By Name---------");
    /*    driver.manage().deleteCookieNamed("Company");
       */

        driver.manage().deleteAllCookies();
        Set<Cookie>  al = driver.manage().getCookies();
        for (Cookie c : al){
            System.out.println(c);
        }
        driver.close();
    }
}
