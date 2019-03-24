package ebayTests;

import ebayUtil.HomepageUtilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeUtilitiesTests extends HomepageUtilities {

    HomepageUtilities homepageUtilities;

    @BeforeMethod
    public void initelEments(){
        homepageUtilities = PageFactory.initElements(driver, HomepageUtilities.class);
    }

    @Test
    public void homeButtonTest(){
        homeButton();
    }
    //Must be signed in
    @Test
    public void savedUtilityTest(){
        savedUtility();
    }
    @Test
    public void motorsUtilTest(){
        motorsUtility();
    }
    @Test
    public void fashionUtilityTest(){
        fashionutility();
    }
    @Test
    public void electronicsUtilityTest(){
        electronicsUtilitly();
    }
    @Test
    public void collectiblesAndArtTest(){
        collectiblesandart();
    }
    @Test
    public void homeAndGardenTest(){
        homeAndGarden();
    }
    @Test
    public void sportingGoodsTest(){
        sportingGoodsUtility();
    }
    @Test
    public void toysUtilityTest(){
        toysUtility();
    }
    @Test
    public void businessAndIndustrialUtilityTest(){
       businessAndIndustrialUtility();
    }
    @Test
    public void musicUtilityTest(){
        musicUtility();
    }
    @Test
    public void dealsUtilityTest(){
        dealsUtility();
    }
    @Test
    public void under10utilityTest(){
        under10Utility();
    }

}
