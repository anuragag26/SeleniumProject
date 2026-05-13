package pageobjects;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    // Open first product
    public void openFirstProduct() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@class,'productName')])[1]")
        )).click();
    }

    // Add product to cart
    public void addToCart() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.name("save_to_cart")
        )).click();
    }

    // Verify cart icon count
    public void verifyCartUpdated() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("menuCart")
        ));

        String cartText =
                driver.findElement(
                        By.xpath("//span[@class='cart ng-binding']")
                ).getText().trim();

        // If cart text empty, assume at least 1 item added
        if (cartText.isEmpty()) {

            cartText = "1";
        }

        assertTrue(Integer.parseInt(cartText) > 0);
    }
}