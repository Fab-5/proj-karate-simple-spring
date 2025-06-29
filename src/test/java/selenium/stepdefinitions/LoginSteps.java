package selenium.stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I open the SauceDemo login page")
    public void i_open_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void i_click_login() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected() {
        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }
}
