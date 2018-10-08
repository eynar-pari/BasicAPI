package gradle.cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static helpers.MyValues.myVar;

/**
 * Created by Eynar.
 */
@RunWith(Cucumber.class)
public class Runner {

    @Before()
    public void beforeScenario(Scenario scenario) {
      //hook
        myVar= new HashMap();
    }


    @After()
    public void afterScenario(Scenario scenario) {
        //hook
    }
}