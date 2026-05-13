package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    // Verify title
    public void verifyTitle(String expectedTitle) {

        String actualTitle = driver.getTitle()
                .replace("\u00A0", "")
                .trim();

        assertEquals(actualTitle, expectedTitle);
    }

    // Click speakers category
    public void clickSpeakers() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'SPEAKERS')]")
        )).click();
    }
}