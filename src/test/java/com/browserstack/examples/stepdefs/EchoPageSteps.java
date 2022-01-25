package com.browserstack.examples.stepdefs;
import com.browserstack.examples.pages.EchoPage;
import com.browserstack.examples.pages.TestBase;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class EchoPageSteps extends TestBase {
    @When("I navigate to Echo Box")
    public void navigateToLoginPage() throws InterruptedException {
        new EchoPage(getDriver()).navigatePage();
    }

    @When("I enter {string}")
    public void enterText(String text) throws InterruptedException {
        new EchoPage(getDriver()).enterText(text);
    }

    @When("I submit")
    public void Submit() throws InterruptedException {
        new EchoPage(getDriver()).pressSubmitButton();
    }

    @Then("it should pass and show message as {string}")
    public void echoShouldSucceed(String message) {
        Assert.assertEquals(new EchoPage(getDriver()).getSuccessMssg(), message);
    }

    @Then("it should fail and show message as {string}")
    public void echoShouldFail(String message) {
        Assert.assertEquals(new EchoPage(getDriver()).getSuccessMssg(), message);
    }
    
}
