package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url = "https://www.batabd.com/";

    public By signInButton = By.xpath("//div[@class='customer-links'] ");
    public By logoutButton = By.xpath("//div[@class='customer-links'] ");
    public By errorMsgforpass = By.cssSelector(".error-message");
    public By errorMsgforemail = By.cssSelector(".error_text");
    public By errorMsgforrequiredata = By.xpath("//span[@class='error_pass_text']");
    public By Assertcheck = By.xpath("//button[normalize-space()='My Profile']");
}
