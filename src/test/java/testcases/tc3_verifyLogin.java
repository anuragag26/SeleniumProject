package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.LoginPage;
import utilities.reportGenerator;

public class tc3_verifyLogin extends reportGenerator {

    @Test
    public void verifyLogin() throws InterruptedException {

        test = extent.startTest("Verify Login");

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.advantageonlineshopping.com/#/");

        // Create LoginPage object
        LoginPage login = new LoginPage(driver);

        // Click user icon
        login.clickUserIcon();

        Thread.sleep(2000);

        // Enter username
        login.enterUsername("anurag123");

        // Enter password
        login.enterPassword("Anurag@123");

        // Click sign in
        login.clickSignIn();

        Thread.sleep(5000);

        // Verify login
        assertEquals(login.isLoginSuccessful(), true);

        // Close browser
        driver.quit();
    }
}