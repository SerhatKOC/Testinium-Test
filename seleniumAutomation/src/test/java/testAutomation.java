import Log.Log;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testAutomation extends firstTest
{
    public By userNameID = By.id("L-UserNameField");
    public By passwdID = By.id("L-PasswordField");
    public By loginButtonID = By.id("gg-login-enter");

    @Test
    public void ggSeleniumTest () throws InterruptedException
    {


        String mail ="test1233@gmail.com";
        String passwd = "deneme123";

        home homePage = new home(driver);
        Log.info("------------------------------------------");
        Log.info("Going to login page.");

        userLogin loginPage = (userLogin) homePage.getLoginPage();

        WebElement usernameField = driver.findElement(userNameID);
        usernameField.click();
        usernameField.sendKeys(mail);

        WebElement passwordField = driver.findElement(passwdID);
        passwordField.click();
        passwordField.sendKeys(passwd);

        Log.info("------------------------------------------");
        Log.info("email: " + mail + ", password: " + passwd);

        WebElement button = driver.findElement(loginButtonID);
        button.click();

        //input accuracy checked
/*      String accountButton  = homePage.getAccountText();
        Log.info("The text written on the My Account title is: " + accountButton);
        assertTrue(accountButton.contains("Hesabım"));

        //search "bilgisayar"
        Log.info("Entering the word 'computer' in the search box");
        SearchResultPage searchResultPage = home.search("bilgisayar");
        searchResultPage.scrollToPage("7200");

        //the search results open and go to the second page
        searchResultPage.choosePage("2");
        assertTrue(driver.getCurrentUrl().contains("2"));

        Log.info("Go to Product details page");
        addTheProduct productDetailsPage = searchResult.productDetail();

        //Checking basket
        String basketMessage = "Sepetinizde ürün bulunmamaktadır.";
        Log.info("Check if the basket is empty");
        assertEquals(basketMessage, basketPage.empty());*/

    }
}
