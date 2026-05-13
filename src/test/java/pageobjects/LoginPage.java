package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // Click user icon
    public void clickUserIcon() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait until loader disappears
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(".loader")
        ));

        // Wait for user icon clickable
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("menuUserLink")
        )).click();
    }

    // Enter username
    public void enterUsername(String username) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("username")
        ));

        driver.findElement(By.name("username"))
                .sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {

        driver.findElement(By.name("password"))
                .sendKeys(password);
    }

    // Click sign in
    public void clickSignIn() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait until loader disappears
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(".loader")
        ));

        // Wait until sign in button clickable
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("sign_in_btn")
        )).click();
    }

    // Verify login successful
    public boolean isLoginSuccessful() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("menuUserLink")
        ));

        String user =
                driver.findElement(By.id("menuUserLink"))
                        .getText();

        return !user.isEmpty();
    }
}