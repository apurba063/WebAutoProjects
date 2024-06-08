package TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import utilities.BrowserSetup;


public class TestLogin extends BrowserSetup {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @BeforeMethod
    public void loadSignInPage() throws InterruptedException {
        getBrowser().get(homePage.url);
        homePage.clickOnElement(homePage.signInButton);
        Thread.sleep(1000);
    }

    @Test
    public void testLoginWithValidCredentials() {
        signInPage.writeOnElement(signInPage.emailInputBox, "cahev71384@eqvox.com");
        signInPage.writeOnElement(signInPage.passwordInputBox, "@A123456a@");
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertTrue(homePage.displayStatus(homePage.Assertcheck));
    }

    @Test
    public void testLoginWithInvalidPassword() {
        signInPage.writeOnElement(signInPage.emailInputBox, "cahev71384@eqvox.com");
        signInPage.writeOnElement(signInPage.passwordInputBox, "123456");
        signInPage.clickOnElement(signInPage.logInButton);
        //Assert.assertEquals(signInPage.getElement(signInPage.errorMsgforpass).getText(), "Invalid E-mail/Mobile No OR Password");
        Assert.assertFalse(homePage.displayStatus(homePage.Assertcheck));
    }

    @Test

    public void testLoginWithInvalidEmail() {
        signInPage.writeOnElement(signInPage.emailInputBox, "cahev71384@");
        signInPage.writeOnElement(signInPage.passwordInputBox, "123456aa");
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertEquals(signInPage.getElement(signInPage.errorMsgforemail).getText(), "Invalid e-mail address");
        Assert.assertFalse(homePage.displayStatus(homePage.Assertcheck));
    }

    @Test
    public void testLoginWithoutPassword() {
        signInPage.writeOnElement(signInPage.emailInputBox, "cahev71384@eqvox.com");
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertEquals(signInPage.getElement(signInPage.errorMsgforrequiredata).getText(), "Required field");
        Assert.assertFalse(homePage.displayStatus(homePage.Assertcheck));
    }

    @Test
    public void testLoginWithoutEmail() {
        signInPage.writeOnElement(signInPage.passwordInputBox, "123456aa");
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertFalse(homePage.displayStatus(homePage.Assertcheck));
    }

    @Test
    public void testLoginWithoutEmailAndPassword() {
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertFalse(homePage.displayStatus(homePage.Assertcheck));
    }

}