package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import Steps.Hooks;


public class LoginPage {

	Hooks drive;


	By username = By.id("user_session_username");
	By password = By.id("user_session_password");
	By login_btn = By.cssSelector("input[type=submit]");

	String user = "";
	String pass = "";
  String url = "https://stage-happy.amco.me/";



    public LoginPage (Hooks drive) {
    	this.drive = drive;
    }

	public void navigateToHappyForParents() {
		drive.getDriver().get(url);
	}

	public void enterCredentials() {
		drive.getDriver().findElement(username).sendKeys(user);
		drive.getDriver().findElement(password).sendKeys(pass);
		drive.getDriver().findElement(login_btn).click();
	}

	public void siteHomePage() {
		String str = drive.getDriver().getCurrentUrl().toString();
        if (str == url) {
        	System.out.println("True");
        } else {
        	System.out.println("False");
        	System.out.println(str);
        }
	}
}
