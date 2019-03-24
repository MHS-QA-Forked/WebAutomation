package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchase extends CommonAPI {
    @FindBy(css = "#gh-ac") public static WebElement searchBar;
    @FindBy(css = "#gh-btn") public static WebElement searchButton;
    @FindBy(xpath = "//div[contains(text(),'Under $1.00')]")
    public static WebElement under1DollarOtion;





    public void purchaseAnItem(){
        searchBar.sendKeys("Keychains");
        searchButton.click();
        under1DollarOtion.click();
    }
}
