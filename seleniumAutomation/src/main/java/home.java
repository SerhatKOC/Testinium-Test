import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home extends baseLogin
{
    By mainScreen = By.className("f2lc5a-0");

    public home(WebDriver driver) { super(driver); }

    public String getHomePageTitle()
    {
        return driver.getTitle();
    }

    public void waitLoading()
    {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainScreen));
    }
}
