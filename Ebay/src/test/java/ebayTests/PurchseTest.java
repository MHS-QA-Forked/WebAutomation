package ebayTests;

import ebayUtil.Purchase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PurchseTest extends Purchase {

    Purchase purchase;

    @BeforeMethod
    public void initElements(){
        purchase = PageFactory.initElements(driver, Purchase.class);
    }
    @Test
    public void purchaseAnItemTest(){
        purchaseAnItem();
    }
}
