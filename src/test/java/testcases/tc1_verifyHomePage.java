package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.HomePage;
import utilities.reportGenerator;

public class tc1_verifyHomePage extends reportGenerator {

    @Test
    public void verifyHomePage() {

        test = extent.startTest("Verify Home Page");

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.advantageonlineshopping.com/#/");

        // Create object of HomePage
        HomePage home = new HomePage(driver);

        // Verify title
        home.verifyTitle("Advantage Shopping");

        // Close browser
        driver.quit();
    }
}