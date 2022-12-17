package cucumber.runner;

import BasePackage.BaseDeviceTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true,
        //Run
        features = {"src/test/java/cucumber/features/"},
        glue = {"cucumber.steps"},
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}, publish = true)
public class TestRunner extends BaseDeviceTest {
}
