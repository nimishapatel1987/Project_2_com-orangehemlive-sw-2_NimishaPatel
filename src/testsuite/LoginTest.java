package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        sendTextToElement(By.xpath("//input[@placeholder ='Username']"),"Admin");

        //Enter the valid Password
        sendTextToElement(By.name("password"),"admin123");

        //Click on submit
        clickOnElement(By.xpath("//button[@type ='submit']"));
    }
}
