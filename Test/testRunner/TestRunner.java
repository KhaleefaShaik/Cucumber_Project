package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "D:/Calyex_Automation_Framework/bdd-framework/Test/features",
        glue={"stepDefination"},
        tags={"@sceond"}
        )
public class TestRunner {

}
