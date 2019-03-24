package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageUtilities extends CommonAPI {

    @FindBy(xpath = "//span[contains (text(), 'Home')]")
    public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(), 'Saved') and @href='/feed']")
    public static WebElement savedUtility;
    @FindBy(xpath = "//a[@href = 'https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334' and contains (text(), 'Motors')]")
    public static WebElement motorsOption;
    @FindBy(xpath = "//a[contains (text(), 'Fashion') and @_sp = 'p2481888.m1380.l3250']")
    public static WebElement fashionUtility;
    @FindBy(xpath = "//a[contains(text(), 'Electronics') and @_sp='p2481888.m1381.l3250']")public static WebElement electronicsUtility;
    @FindBy(xpath = "//a[contains(text(), 'Collectibles & Art') and @href = 'https://www.ebay.com/b/Collectibles-Art/bn_7000259855']")
    public static WebElement collectiblesAndArt;
    @FindBy(xpath = "//a[contains(text(), 'Home & Garden') and @_sp='p2481888.m1383.l3250']")
    public static WebElement homeAndGarden;
    @FindBy(xpath = "//a[contains(text(), 'Sporting Goods') and @href ='https://www.ebay.com/b/Sporting-Goods/888/bn_1865031' ]")
    public static WebElement sportingGoodsUtility;
    @FindBy(xpath ="//a[contains(text(), 'Toys') and @href ='https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497' ]")
    public static WebElement toysUtility;
    @FindBy(xpath = "//a[contains(text(), 'Business & Industrial') and @href ='https://www.ebay.com/b/Business-Industrial/12576/bn_1853744' ]")
    public static WebElement businessAndIndustrialUtility;
    @FindBy(xpath = "//a[contains (text(), 'Music') and @_sp = 'p2481888.m1387.l3250']")
    public static WebElement musicUtility;
    @FindBy(xpath = "//a[contains (text(), 'Deals') and @_sp = 'p2481888.m1388.l3250']")
    public static WebElement dealsUtility;
    @FindBy(xpath = "//a[contains (text(), 'Under $10') and @_sp = 'p2481888.m1389.l3250']")
    public static WebElement under10Utility;
    @FindBy(css = "#sgnBt")
    public static WebElement signInButton;
    @FindBy(css ="#userid")
    public static WebElement userIdInputBar;
    @FindBy(css = "#pass")
    public static WebElement passwordInputBar;




    public void homeButton(){
        homeButton.click();
    }
    //Must be signed in to access feed
    public void savedUtility(){
        savedUtility.click();
        userIdInputBar.sendKeys("joshuav773@gmail.com");
        passwordInputBar.sendKeys("Bball1773");
        signInButton.click();
    }
    public void motorsUtility(){
        motorsOption.click();
    }
    public void fashionutility(){
        fashionUtility.click();
    }
    public void electronicsUtilitly(){
        electronicsUtility.click();
    }
    public void collectiblesandart(){
        collectiblesAndArt.click();
    }
    public void homeAndGarden(){
        homeAndGarden.click();
    }
    public void sportingGoodsUtility(){
        sportingGoodsUtility.click();
    }
    public void toysUtility(){
        toysUtility.click();
    }
    public void businessAndIndustrialUtility(){
        businessAndIndustrialUtility.click();
    }
    public void musicUtility(){
        musicUtility.click();
    }
    public void dealsUtility(){
        dealsUtility.click();
    }
    public void under10Utility(){
        under10Utility.click();
    }








}
