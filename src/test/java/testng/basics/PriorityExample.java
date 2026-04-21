package testng.basics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testX(){
        System.out.println("Test X");
    }

    @Test(priority = 2)
    public void testB(){
        System.out.println("Test B");
    }

    @Test
    public void testZ(){
        System.out.println("Test Z");
    }

    @Test(priority = 'T')
    public void testM(){
        System.out.println("Test M");
    }

    @Test(priority = -5)
    public void testY(){
        System.out.println("Test Y");
    }
}
