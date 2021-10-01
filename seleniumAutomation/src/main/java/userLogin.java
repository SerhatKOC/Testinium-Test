import org.openqa.selenium.WebDriver;

public class userLogin extends baseLogin
{
    public userLogin(WebDriver driver) { super(driver); }

    public home login(user setUser)
    {
        home homePage = new home(driver);
        homePage.waitLoading();
        return homePage;
    }
}
