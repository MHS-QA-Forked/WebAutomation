package ebayTests;

import ebayUtil.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signInTest extends SignIn {

    public SignIn signIn;

    @BeforeMethod
    public void initElements(){
        signIn = PageFactory.initElements(driver,SignIn.class);
    }
    @Test
    public void signInTest(){
        signIn();
    }
    @Test
    public void registerTest(){
       registerNewUser();
    }


}
