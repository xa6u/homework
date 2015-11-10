package lecture6;

import static org.junit.Assert.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverTest {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tierDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testBrowser() throws Exception {
        driver = new HtmlUnitDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        assertEquals("Cheese! - Пошук Google", driver.getTitle());
    }

    @Test
    public void testFirefox() throws Exception {
        driver = new FirefoxDriver();
        driver.get("http://www.google.com/webhp?complete=1&hl=en");
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Cheese");
        WebElement resultsDiv = driver.findElement(By.className("lsb"));
        resultsDiv.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        List<WebElement> allSuggestions = driver.findElements(By.xpath("//h3[@class='r']"));
        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText());
        }
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSelenide() {
        open("http://www.google.com");
        $(By.name("q")).setValue("Cheese!").submit();
        $("#lfootercc").should(appear);
        ElementsCollection collection = $$(By.xpath("//h3[@class='r']"));
        assertFalse(collection.isEmpty());
        for (SelenideElement element : collection) {
            System.out.println(element.getText());
        }

    }

}

