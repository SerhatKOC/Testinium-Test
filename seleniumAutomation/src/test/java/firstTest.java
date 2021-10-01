import Log.Log;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

//TestInstance to not use static
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class firstTest
{
    WebDriver driver;
    Log log = new Log();
    @BeforeAll
    public void setUp()
    {
        String ggUrl="https://www.gittigidiyor.com";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); //------
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        Log.info("------------------------------------------");
        Log.info("Test is starting...");
        driver.get(ggUrl);
        driver.manage().window().maximize();
        Log.info("------------------------------------------");
        Log.info("Opening Page " + ggUrl);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
        Log.info("Test is ending!");
    }
}
