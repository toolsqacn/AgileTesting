package cn.toolsqa.ticket.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/html-report/"}
		//format = {"json:target/migu-read.json"}
		//features = {"classpath:features"}
)
public class RunCukesReadTest {
}
