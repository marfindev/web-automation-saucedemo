package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoSteps {
    private WebDriver driver;

    @Given("User is on the Saucedemo login page")
    public void userIsOnTheSaucedemoLoginPage() {
        System.setProperty("webdriver.chrome.driver", "D:\\marfinproject\\web-automation-saucedemo\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User is redirected to the products page")
    public void userIsRedirectedToTheProductsPage() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("inventory.html"));
        driver.quit();
    }

    @Then("User should see an error message")
    public void userShouldSeeAnErrorMessage() {
        String errorMessage = driver.findElement(By.cssSelector(".error-button")).getText();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage);
        driver.quit();
    }
}
