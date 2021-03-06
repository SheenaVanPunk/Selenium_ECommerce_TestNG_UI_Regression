package testClasses;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.SearchPage;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    @Test(groups = "regression")
    @Parameters("itemForSearch")
    public void testSearchForItem(String itemForSearch) {

        SearchPage sp = hp.searchForAnItem(itemForSearch);
        String searchPageTitle = sp.getSearchPageTitle();
        assertTrue(searchPageTitle.contains(itemForSearch));
      }

      @Test
    public void testVerifyIfEverySearchResultMatchesSearchedItem(){

      }

}
