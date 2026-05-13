package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.HomePage;
import pageobjects.SpeakersPage;

import utilities.reportGenerator;

public class tc2_verifySpeakersPage extends reportGenerator {

    @Test
    public void verifySpeakersPage() throws InterruptedException {

        test = extent.startTest("Verify Speakers Page");

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.advantageonlineshopping.com/#/");

        // Create HomePage object
        HomePage home = new HomePage(driver);

        // Wait for loading
        Thread.sleep(3000);

        // Click speakers categorys
        home.clickSpeakers();

        Thread.sleep(3000);

        // Create SpeakersPage object
        SpeakersPage speakers = new SpeakersPage(driver);

        // Verify products
        speakers.verifySpeakerProducts();

        // Close browser
        driver.quit();
    }
}