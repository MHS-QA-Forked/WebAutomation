package ebayUtil;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar {

    @FindBy(css = "#gh-ac") public static WebElement searchBar;
    @FindBy(css = "#gh-btn") public static WebElement searchButton;


    public void usingSearchbar(){
        searchBar.sendKeys("Car Parts", Keys.ENTER);
    }
    public void searchbutton(){
        searchBar.sendKeys("Selenium books");
        searchButton.click();
    }
}
