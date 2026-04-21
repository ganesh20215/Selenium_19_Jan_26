package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(enabled = false)
    public void verifySearchProduct() {
        System.out.println("Search Product...");
    }

/*    @Test(groups = {"smoke"})
    public void verifyAddToCardProduct() {
        Assert.assertTrue(false);
        System.out.println("Search Product...");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyDeliveryOfProduct() {
        System.out.println("Delivery Of Product...");
    }*/
}
