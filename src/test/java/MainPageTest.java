
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTest extends BaseClass{

    @BeforeClass
    public void setUp(){
        initializeChromeDriver();
    }

    @Test
    public void validateThatAllLinksWorkAsExpected(){
        driver.get(sidleyMainPage);

        mainPage.people.click();
        assertThat(driver.getTitle()).containsIgnoringCase("People");

        mainPage.services.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Services");

        mainPage.industries.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Industries");

        mainPage.insights.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Insights");

        mainPage.ourStory.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Stories | Sidley Austin LLP");

        mainPage.news.click();
        assertThat(driver.getTitle()).containsIgnoringCase("News");

        mainPage.diversity.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Diversity");

        mainPage.proBono.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Pro Bono | Sidley Austin LLP");

        mainPage.socialResponsibility.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Social Responsibility");

        mainPage.alumni.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Alumni");

        mainPage.careers.click();
        assertThat(driver.getTitle()).containsIgnoringCase("Careers");

    }

    @AfterClass
    public void after(){
        System.out.println();
    }
}
