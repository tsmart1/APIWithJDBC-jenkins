package com.sparta.ts;

import com.sparta.ts.pagemodels.Homepage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomepageStepdefs {
    
    static {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        ApiWithJdbcApplication.main(new String[]{""});
    }

    WebDriver webDriver = new EdgeDriver();
    Homepage homepage = new Homepage(webDriver);

    @Given("The application is running")
    public void theApplicationIsRunning() {

    }

    @And("I am on the homepage")
    public void iAmOnTheHomepage() {
        homepage.navigateToHomepage();
    }

    @When("I click the ID link")
    public void iClickTheIdLink() {
        homepage.clickIdLink();
    }

    @When("I click the First Name link")
    public void iClickTheFirstNameLink() {
        homepage.clickFirstNameLink();
    }

    @When("I click the Last Name link")
    public void iClickTheLastNameLink() {
        homepage.clickLastNameLink();
    }

    @When("I click the email link")
    public void iClickTheEmailLink() {
        homepage.clickEmailLink();
    }

    @When("I click the Birth Date link")
    public void iClickTheBirthDateLink() {
        homepage.clickBirthDateLink();
    }

    @Then("I will be taken to the ID quick page")
    public void iWillBeTakenToTheIdQuickPage() {
        assertEquals("http://localhost:8080/api/author/id/101", webDriver.getCurrentUrl());
    }

    @Then("I will be taken to the First Name quick page")
    public void iWillBeTakenToTheFirstNameQuickPage() {
        assertEquals("http://localhost:8080/api/author/firstname/jeff", webDriver.getCurrentUrl());
    }

    @Then("I will be taken to the Last Name quick page")
    public void iWillBeTakenToTheLastNameQuickPage() {
        assertEquals("http://localhost:8080/api/author/lastname/white", webDriver.getCurrentUrl());
    }

    @Then("I will be taken to the email quick page")
    public void iWillBeTakenToTheEmailQuickPage() {
        assertEquals("http://localhost:8080/api/author/email/ufeest@example.org", webDriver.getCurrentUrl());
    }

    @Then("I will be taken to the Birth Date quick page")
    public void iWillBeTakenToTheBirthDatePage() {
        assertEquals("http://localhost:8080/api/author/birthdate/1986-12-12", webDriver.getCurrentUrl());
    }

    @After
    public void closeWebDriver() {
        webDriver.quit();
    }
}
