import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CareersPage;
import pages.MainPage;

public class BaseClass {
    protected String sidleyMainPage = "https://www.sidley.com/en/us/";
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    CareersPage careersPage;

    public void initializeChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        mainPage = new MainPage(driver, wait);
        careersPage = new CareersPage(driver,wait);
    }

}
