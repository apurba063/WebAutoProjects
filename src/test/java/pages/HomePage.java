package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public String url = "https://www.batabd.com/";

    public By signInButton = By.xpath("//div[@class='customer-links'] ");
    public By logoutButton = By.xpath("//div[@class='customer-links'] ");
    public By errorMsgforpass = By.cssSelector(".error-message");
    public By errorMsgforemail = By.cssSelector(".error_text");
    public By errorMsgforrequiredata = By.xpath("//span[@class='error_pass_text']");
    public By Assertcheck = By.xpath("//button[normalize-space()='My Profile']");
    public By menuhover = By.xpath("//a[@href='https://www.batabd.com/collections/men?constraint=bata']//span[contains(text(),'Bata')]");
    public By Scroll = (By.xpath("//a[normalize-space()='2']"));

    public By scroll2 =(By.xpath("//div[@class='product-pagination has-pagination']//li[3]"));

    public By scroll3 =(By.xpath("//input[@id='product-add-to-cart']"));
    public By scroll4 =(By.xpath("//button[normalize-space()='Check out now']"));

}
