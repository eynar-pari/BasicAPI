package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Eynar
 */
public class Chrome implements IBrowser {

    @Override
    public WebDriver createSession() {
        String PATH_PROJECT = new File(".").getAbsolutePath().replace(".", "");
        System.setProperty("webdriver.chrome.driver", (PATH_PROJECT+"src+test+java+drivers+chromedriver.exe").replace("+",File.separator));
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-memory-info");
        options.addArguments("--no-sandbox");
        options.setExperimentalOption("prefs", prefs);
        return new ChromeDriver(options);
    }
}
