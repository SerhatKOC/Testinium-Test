import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addTheProduct extends baseLogin
{
    private final By lowProductPrice  = By.id("sp-price-lowPrice");
    private final By highProductPrice = By.id("sp-price-highPrice");
    private final By addToBasket = By.id("add-to-basket");
    private final By goToBasket = By.className("robot-header-iconContainer-cart");

    public addTheProduct(WebDriver driver) { super(driver); }

    public String productPrice()
    {
        String productPrice = driver.findElement(lowProductPrice).getText();
        if (productPrice.isEmpty())
        {
            return getText(highProductPrice);
        }
        return getText(lowProductPrice);
    }

    public void addToBasket(){  click(addToBasket,20);  }

    public basketSetting goBasket()
    {
        click(goToBasket,10);
        return new basketSetting(driver);
    }

}
