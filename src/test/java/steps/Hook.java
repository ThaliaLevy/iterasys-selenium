package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends Base {
    private Base base;

    public Hook(Base base) {
        this.base = base;
    }

   @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver95.exe");
        base.driver = new ChromeDriver();

        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        base.driver.manage().window().maximize();

   }

   @After
    public void tearDown(){

   }

}
