package com.epam.bddlect;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
//        1
//        features = "src/test/resources/feature/calendar",
//        glue = {"com.epam.bddlect.step.calendar"},
//        publish = true)
//        stepNotifications = true)
//        2
features = "src/test/resources/feature/search",
glue = {"com.epam.bddlect", "com.epam.bddlect.step.search"},
//stepNotifications = true,
        publish = true, tags = "@DEMO")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}