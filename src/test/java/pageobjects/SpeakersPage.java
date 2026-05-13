package pageobjects;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpeakersPage {

    WebDriver driver;

    public SpeakersPage(WebDriver driver) {

        this.driver = driver;
    }

    // Verify speaker products are displayed
    public void verifySpeakerProducts() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'cell')]")
        ));

        List<WebElement> products = driver.findElements(
                By.xpath("//div[contains(@class,'cell')]"));

        assertTrue(products.size() > 0);
    }
}