package com.epam.bddlect;

import com.epam.bddlect.common.TestContext;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseHook {

    private WebDriver driver;

    @BeforeStep
    public void beforeStep() {
        System.out.println("BeforeStep");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("AfterStep");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @Before
    public void before() {
        System.out.println("Before");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        TestContext.getInstance().set("driver", driver);
    }

    @After
    public void closeBrowser() {
        System.out.println("After");
        driver.quit();
        TestContext.getInstance().clear();
    }
}
