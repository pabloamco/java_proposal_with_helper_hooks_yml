package pages;

import org.openqa.selenium.By;
import Steps.Hooks;
import config.ObjectPorperties;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;


public class LoginPage {

	Hooks driver;


	By username = By.id("user_session_username");
	By password = By.id("user_session_password");
	By login_btn = By.cssSelector("input[type=submit]");



    public LoginPage (Hooks driver) {
    	this.driver = driver;
    }

	public void navigateToHappyForParents() {
		driver.getDriver().get(ObjectPorperties.getProperty("web_address.url"));
	}

	public void enterCredentials() {
		driver.getDriver().findElement(username).sendKeys(ObjectPorperties.getProperty("parent_keys.parent_account"));
		driver.getDriver().findElement(password).sendKeys(ObjectPorperties.getProperty("parent_keys.parent_password"));
		driver.getDriver().findElement(login_btn).click();
	}

	public void siteHomePage() {
		String str = driver.getDriver().getCurrentUrl().toString();
		String url = ObjectPorperties.getProperty("web_address.url");
        if (str == url) {
        	System.out.println("True");
        } else {
        	System.out.println("False");
        	System.out.println(str);
        }
	}
}
