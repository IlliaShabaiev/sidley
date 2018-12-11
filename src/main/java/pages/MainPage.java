package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section[1]/div[1]/nav/a[1]")
    public WebElement people;

    @FindBy(xpath = "/html/body/section[1]/div[1]/nav/a[2]")
    public WebElement services;

    @FindBy(xpath = "/html/body/section[1]/div[1]/nav/a[3]")
    public WebElement industries;

    @FindBy(xpath = "/html/body/section[1]/div[1]/nav/a[4]")
    public WebElement insights;

    @FindBy(xpath = "/html/body/section[1]/div[1]/nav/a[5]")
    public WebElement ourStory;

    @FindBy(xpath = "/html/body/section[1]/div[2]/nav/a[1]")
    public WebElement news;

    @FindBy(xpath = "/html/body/section[1]/div[2]/nav/a[2]")
    public WebElement diversity;

    @FindBy (xpath = "/html/body/section[1]/div[2]/nav/a[3]")
    public WebElement proBono;

    @FindBy (xpath = "/html/body/section[1]/div[2]/nav/a[4]" )
    public WebElement socialResponsibility;

    @FindBy (xpath = "/html/body/section[1]/div[2]/nav/a[5]")
    public WebElement alumni;

    @FindBy (xpath = "/html/body/section[1]/div[2]/nav/a[6]")
    public WebElement careers;

    @FindBy(xpath = "/html/body/section[1]/div[2]/button/i")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"global-search\"]/div/fieldset/input")
    public WebElement searchBarInput;

    @FindBy
    public WebElement searchButton;
}

