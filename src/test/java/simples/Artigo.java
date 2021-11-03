package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.cssSelector;

public class Artigo {

    String url;
    WebDriver driver;

    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver95.exe");
        url = "https://pt.wikipedia.org";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @After
    public void parar(){
    //driver.quit();
    }

    @Test
    public void consultarArtigo(){
    driver.get(url);
    driver.findElement(cssSelector("#searchInput")).sendKeys("Páscoa");
    assertEquals("Wikipédia, a enciclopédia livre", driver.getTitle());
    driver.findElement(cssSelector("#searchform > button")).click();
    assertTrue(driver.getTitle().contains("Páscoa"));

    }

}
