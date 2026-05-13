package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.HomePage;
import pageobjects.CartPage;

import utilities.reportGenerator;

public class tc4_verifyAddToCart extends reportGenerator {

    @Test
    public void verifyAddToCart() throws InterruptedException {

        test = extent.startTest("Verify Add To Cart");

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.advantageonlineshopping.com/#/");

        // Create HomePage object
        HomePage home = new HomePage(driver);

        // Open speakers category
        home.clickSpeakers();

        Thread.sleep(3000);

        // Create CartPage object
        CartPage cart = new CartPage(driver);

        // Open first product
        cart.openFirstProduct();

        Thread.sleep(3000);

        // Add to cart
        cart.addToCart();

        Thread.sleep(3000);

        // Verify cart updated
        cart.verifyCartUpdated();

        // Close browser
        driver.quit();
    }
}