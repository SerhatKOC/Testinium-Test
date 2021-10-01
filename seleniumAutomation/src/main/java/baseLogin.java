import SearchResultPage.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class baseLogin extends ggSet
{
    public static WebDriver driver;
    By findLoginButton = By.cssSelector("div[data-cy='header-user-menu']");
    By loginButton = By.cssSelector("a[data-cy='header-login-button']");
    public static By searchBox = By.className("sc-4995aq-0");

    public baseLogin(WebDriver driver) { super(driver); }


    public baseLogin getLoginPage()
    {
        moveToElement(findLoginButton);
        click(loginButton, 7);
        return new userLogin(driver);
    }
    public String getAccountText()
    {
        return getText(findLoginButton);
    }

    public static SearchResultPage search(String keyword)
    {
        driver.findElement(searchBox).sendKeys(keyword + Keys.ENTER);

        return new SearchResultPage(driver);
    }
}
