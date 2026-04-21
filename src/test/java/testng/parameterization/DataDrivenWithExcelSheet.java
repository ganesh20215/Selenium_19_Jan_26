package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenWithExcelSheet {

    @DataProvider(name = "testData")
    public Object[][] getDataFromFun() throws IOException {
        Object[][] obj = getDataFromExcel("D:\\classes\\TestNGDemoForMorningBatch.xlsx", "TestCases");

        return obj;
    }

    public static String[][] getDataFromExcel(String filePath, String sheetName) throws IOException {
        FileInputStream fp = new FileInputStream(filePath); //Access to file
        Workbook wb = new XSSFWorkbook(fp);                 //Access to workbook
        Sheet sh = wb.getSheet(sheetName);                  //Access the sheet name

        int rows = sh.getPhysicalNumberOfRows();            //physical row
        int cols = sh.getRow(0).getLastCellNum();         //physical column

        String[][] data = new String[rows-1][cols];         //String the data in rows and columns

        for (int i = 1; i < rows; i++){                     //Outer for loop
            Row r = sh.getRow(i);                           // rows
            for (int j = 0; j < cols; j++){                 //colmum
                Cell c = r.getCell(j);
                data[i-1][j] = c.toString();
            }
        }
        return data;
    }


    @Test(dataProvider = "testData")
    public void verifyParameterizationDemo(String userName, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        //driver.close();
    }

}
