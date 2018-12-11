package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public CareersPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/div[2]/div/section/div[1]/ul/div[1]/li/a")
    public WebElement lateralsAndExperiencedLawyers;

    @FindBy(xpath = "/html/body/main/div[2]/div/section/div[2]/div[2]/ul/li[1]/a/span")
    public WebElement NorthAmerica;

//    @FindBy(xpath = "//*[@data-siteimprove-title='North America']//*[@class='location-title']")
//    public WebElement northAmerica;

    @FindBy(xpath = "//*[@class='btn btn-submit js-submit-btn']")
    public WebElement go;


}
