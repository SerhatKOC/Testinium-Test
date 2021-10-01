import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ggSet
{
    protected static WebDriver driver;
    public ggSet(WebDriver driver){ this.driver=driver; }

    public static void click(By element, int timeOut)
    {
        WebDriverWait wait = new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public String getText(By element)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.elementToBeClickable(element)).getText();
    }
    public void moveToElement(By element)
    {
        WebElement otherElement = driver.findElement(element);
        String strJavaScript = "var element = arguments[0]; var mouseEventObj = document.createEvent('MouseEvents'); mouseEventObj.initEvent( 'mouseover', true, true ); element.dispatchEvent(mouseEventObj);";
        ((JavascriptExecutor) driver).executeScript(strJavaScript, otherElement);
    }
    public void scrollToPage(String pixel)
    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + pixel + ")");
    }
    public void scrollElement(By otherElement)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", otherElement);
    }
}
