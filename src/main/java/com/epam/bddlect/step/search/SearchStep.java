package com.epam.bddlect.step.search;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchStep {

//    private WebDriver driver;
//
//    @Before
//    public void before() {
//        System.out.println("Before");
//        driver = new ChromeDriver();
//    }
//
//    @Given("I am on the Google search page")
//    public void openGoogle() {
//        System.out.println("Navigate");
//        driver.get("https://www.google.com");
//    }
//
//    @When("I search for {string}")
//    public void search(String query) {
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys(query);
//        element.submit();
//    }
//
//    @Then("the page title should start with {string}")
//    public void checkTitle(String expected) {
//        new WebDriverWait(driver, Duration.ofMillis(10L))
//                .until((ExpectedCondition<Boolean>) d -> d.getTitle().toLowerCase().startsWith(expected));
//    }
//
//    @After
//    public void closeBrowser() {
//        System.out.println("After");
//        driver.quit();
//    }
//
//    @Given("users are in db:")
//    public void createUsers(DataTable dataTable) {
//
//    }
}