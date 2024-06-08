package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
    public String password ="@A123456a@";
    public String phoneNumber = "01675842235";
    public String Email = "cahev71384@eqvox.com";

    public By emailInputBox = By.xpath("//input[@id='memberId']");
    public By passwordInputBox = By.xpath("//input[@id='password']");
    public By logInButton = By.xpath("//input[@value='Log In']");
    public By errorMsgforpass = By.cssSelector(".error-message");
    public By errorMsgforrequiredata = By.xpath("//span[@class='error_pass_text']");
    public By errorMsgforemail = By.cssSelector(".error_text");
    public By Assertcheck = By.xpath("//button[normalize-space()='My Profile']");
}
