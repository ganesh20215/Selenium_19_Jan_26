package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyAccountCreation() {
        System.out.println("Verify Account Creation..");
    }
}
