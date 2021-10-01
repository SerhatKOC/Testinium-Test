import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basketSetting extends baseLogin
{
        public basketSetting(WebDriver driver) { super(driver); }

    private final By priceInBasket = By.className("total-price");
    private final By products = By.cssSelector("option[value='2']");
    private final By totalProduct = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-of-type(1)");
    private final By deleteProduct = By.cssSelector("a[title='Sil']");
    private final By emptyBasket = By.cssSelector(".gg-w-22.gg-d-22.gg-t-21.gg-m-18>:nth-child(1)");


    public String priceInTheBasket()
    {
        return driver.findElement(priceInBasket).getText();
    }

    public void setNumberOfProducts()
    {
        click(products,7);
    }

    public String getTotalProduct()
    {
        return driver.findElement(totalProduct).getText();
    }

    public void deleteProduct()
    {
        click(deleteProduct,7);
    }

    public String empty()
    {
        return driver.findElement(emptyBasket).getText();
    }
}
