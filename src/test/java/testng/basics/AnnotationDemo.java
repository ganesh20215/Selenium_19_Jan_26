package testng.basics;

import org.testng.annotations.*;

public class AnnotationDemo {

    @AfterClass
    public void afClass(){
        System.out.println("After Class");
    }

    @BeforeClass
    public void bfClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void closing(){
        System.out.println("After Method");
    }


    @Test(groups = "smoke")
    public void m1(){
        System.out.println("M1");
    }

    @Test
    public void m2(){
        System.out.println("M2");
    }


    @AfterTest
    public void afTest(){
        System.out.println("After Test");
    }

    @BeforeTest
    public void bfTest(){
        System.out.println("Before Test");
    }

    @AfterSuite
    public void afSuite(){
        System.out.println("After Suite");
    }

    @BeforeSuite
    public void bfSuite(){
        System.out.println("Before Suite");
    }
}
