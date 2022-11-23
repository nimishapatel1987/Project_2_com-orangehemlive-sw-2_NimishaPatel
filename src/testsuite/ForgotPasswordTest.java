package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        clickOnElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String expectedText = "Reset Password";
        String actualText = getTextFromElement(By.xpath("//h6[@class ='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));

        Assert.assertEquals(expectedText, actualText);

    }
}
