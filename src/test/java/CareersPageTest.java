import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CareersPageTest extends BaseClass{

    @BeforeClass
    public void setUp(){
        initializeChromeDriver();
    }

    @Test
    public void goToCareersClickOnLateralsAndExperiencedLawyers(){
        driver.get(sidleyMainPage);
        mainPage.careers.click();
        careersPage.lateralsAndExperiencedLawyers.click();
//        careersPage.NorthAmerica.click();
//        careersPage.go.submit();
    }

}
