import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchBarTest extends BaseClass{

    @BeforeClass
    public void setUp(){
        initializeChromeDriver();
    }

    @Test
    public void testSearch(){
        driver.get(sidleyMainPage);
        mainPage.searchBar.click();
    }

}
