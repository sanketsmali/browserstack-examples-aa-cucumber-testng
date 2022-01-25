package com.browserstack.examples.stepdefs;
import com.browserstack.examples.pages.LoginPage;
import com.browserstack.examples.pages.TestBase;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class LoginPageSteps extends TestBase{
    @Given("I am on the Base Page")
    public void checkBasePage() throws InterruptedException{
        
    }
    @When("I navigate to Login Page")
    public void navigateToLoginPage() throws InterruptedException {
        new LoginPage(getDriver()).navigatePage();
    }

    @When("I enter username as {string}")
    public void enterUsername(String username) throws InterruptedException {
        new LoginPage(getDriver()).enterUsername(username);
    }

    @When("I enter password as {string}")
    public void enterPassword(String password) {
        new LoginPage(getDriver()).enterPassword(password);
    }

    @When("I login")
    public void Login() {
        new LoginPage(getDriver()).pressLoginButton();
    }

    @Then("I should see success message as {string}")
    public void loginShouldSucceed(String message) {
        Assert.assertEquals(new LoginPage(getDriver()).getSuccessMssg(), message);
    }

}
