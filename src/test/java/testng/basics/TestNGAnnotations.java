package testng.basics;

import org.testng.annotations.Test;

public class TestNGAnnotations {

    @Test(invocationCount = 5000, invocationTimeOut = 1)
    public void annotations() {
        System.out.println("Annotations...");
    }
}
