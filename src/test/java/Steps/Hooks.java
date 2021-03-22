package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.Yaml;

import config.ObjectPorperties;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})

public class Hooks {
	private static boolean initialized = false;
	
	public WebDriver driver;

	  @Before
		public void setUp() throws Exception {
		  if(!initialized) {
			System.out.println("-----------------Starting Scenario-----------------");
			driver = new ChromeDriver();
			initialized = true;
			ObjectPorperties.initObjProp();
		  }
		}
	  
	  public WebDriver getDriver() {
		  return driver;
	  }
	  
	  @After
	    public void AfterScenario() {
		  System.out.println("-----------------Finishing Scenario-----------------");
		  driver.quit();
	  }
}
