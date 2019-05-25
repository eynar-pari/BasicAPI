package driverManager;
import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * Eynar
 */
public class Driver {

    private WebDriver driver;
    private static Driver currentSession = null;

    /**
     * This method is the constructor for Driver (DriverSelenium)
     */
    private Driver(){
        driver = FactoryBrowser.make("chrome").createSession();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    /**
     * This method is to get the current browser as singleton
     * @return
     */
    public static Driver getCurrentSession() {
        if (currentSession ==null)
            currentSession =new Driver();
        return currentSession;
    }

    /**
     * This method is to get a driver
     * @return
     */
    public WebDriver getDriver(){
        return driver;
    }

     /**
     * This method is to close the driver
     */
    public void quitDriver() {
        try {
            driver.quit();
        } catch (Exception e) {
        }
        currentSession =null;
        driver = null;
    }
}
