package TestRunner;



import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
	
	features = {"AllFeatureFile"},
	glue = {"StepDefination"},
	dryRun =false,
	
	plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
	
)			
	

public class RunnerClass extends AbstractTestNGCucumberTests  {

}
