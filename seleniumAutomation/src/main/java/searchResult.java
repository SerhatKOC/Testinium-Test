import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;

public class searchResult extends baseLogin
{
    public searchResult(WebDriver driver) { super(driver);  }

    public static By randomSelect()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(32) + 1;
        return By.cssSelector(".products-container>li:nth-of-type(" + randomNumber + ")");
    }
    public void choose(String pageNumber)
    {
        driver.get(driver.getCurrentUrl() + "&sf=" + pageNumber);
    }

    public static addTheProduct productDetail()
    {
        click(randomSelect(), 7);
        return new addTheProduct(driver);
    }

}
