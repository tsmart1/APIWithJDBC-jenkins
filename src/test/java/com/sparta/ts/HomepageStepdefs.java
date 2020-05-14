package com.sparta.ts;

import com.sparta.ts.pagemodels.Homepage;
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
    }

    WebDriver webDriver = new EdgeDriver();
    Homepage homepage = new Homepage(webDriver);

    @Given("The application is running")
    public void theApplicationIsRunning() {
        ApiWithJdbcApplication.main(new String[]{""});
    }

    @And("I am on the homepage")
    public void iAmOnTheHomepage() {
        homepage.navigateToHomepage();
    }

    @When("I click the ID link")
    public void iClickTheIdLink() {
        homepage.clickIdLink();
    }

    @Then("I will be taken to the correct page")
    public void iWillBeTakenToTheCorrectPage() {
        assertEquals("http://localhost:8080/api/author/id/101", webDriver.getCurrentUrl());
    }
}
