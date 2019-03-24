package ebayTests;

import ebayUtil.SearchBar;
import org.testng.annotations.Test;

public class SearchBarTest extends SearchBar {

    @Test
    public void usingSearchBarTest(){
        usingSearchbar();
    }
    @Test
    public void searchbuttonTest(){
        searchbutton();
    }
}
