package SingletonPattern.SeleniumExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

    private static DriverInit instanceDriver = null;
    private WebDriver driver;

    private DriverInit(){

    }

    public WebDriver openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static DriverInit getInstance(){
        if(instanceDriver == null)
            instanceDriver = new DriverInit();
        return instanceDriver;
    }
}
