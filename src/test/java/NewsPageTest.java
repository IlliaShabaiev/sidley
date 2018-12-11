import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NewsPage;


public class NewsPageTest extends BaseClass {


@BeforeClass
public void setUp() { initializeChromeDriver(); }


@Test
public void GoToSearchByKeyWordsField(){
        driver.get(sidleyMainPage);
        mainPage.news.click();
        driver.findElement(By.xpath("/html/body/main/section/div[3]/div/div[1]")).sendKeys("lawyer");
        driver.findElement(By.xpath("/html/body/main/section/div[3]/div/div[1]/button")).click();
        }

}
