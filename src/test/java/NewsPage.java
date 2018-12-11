package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class NewsPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public NewsPage(WebDriver driver, WebDriverWait wait) {
        this.driver =driver;
        this.wait =wait;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/main/section/div[3]/div/div[1]")
    public WebElement SearchByKeywords;

    }


