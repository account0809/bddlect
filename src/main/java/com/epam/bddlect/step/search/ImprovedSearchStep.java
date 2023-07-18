package com.epam.bddlect.step.search;

import com.epam.bddlect.common.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImprovedSearchStep {

    public ImprovedSearchStep() {

    }

    public ImprovedSearchStep(String x) {

    }

    @Given("I am on the Google search page")
    public void openGoogle() {
        System.out.println("Navigate");
        TestContext.getInstance().get("driver", WebDriver.class).get("https://www.google.com");
    }

    @Then("I login with {string}" )
    public void login(String userId) {

    }

    @When("I search for {string}")
    public void search(String query) {
        TestContext.getInstance().set("search_query", query);
        WebElement element = TestContext.getInstance().get("driver", WebDriver.class).findElement(By.name("q"));
        element.sendKeys(query);
        element.submit();
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String expected) {
        TestContext.getInstance().get("search_query", String.class);
        new WebDriverWait(TestContext.getInstance().get("driver", WebDriver.class), Duration.ofMillis(10L))
                .until((ExpectedCondition<Boolean>) d -> d.getTitle().toLowerCase().startsWith(expected));
    }
}
